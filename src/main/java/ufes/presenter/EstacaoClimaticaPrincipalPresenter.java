package ufes.presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import ufes.adapter.Log;
import ufes.model.DadoClima;
import ufes.view.ConfiguracaoSistemaView;
import ufes.view.EstacaoClimaticaView;

public class EstacaoClimaticaPrincipalPresenter {
    private EstacaoClimaticaView estacaoClimaticaView;
    private ArrayList<IPainel> paineis;
    private ArrayList<DadoClima> dadosClima;
    private ConfiguracaoSistemaView telaLog;
    private Log log;
    private int linhaSelecionada_Registros; // Linha selecionada na tabela de registros
    
    public EstacaoClimaticaPrincipalPresenter(){
        estacaoClimaticaView = new EstacaoClimaticaView();
        telaLog = new ConfiguracaoSistemaView();
        paineis = new ArrayList();
        dadosClima = new ArrayList();
        log = new Log("JSON");
        
        /*Listener para abrir a tela de Log*/
        estacaoClimaticaView.getjMenuLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLog.setVisible(true);
            }
        });
        
        /*Listener para a configuração de Log*/
        telaLog.getjButtonSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                configuraLog();
            }
        });
        
        /*Listener para o botão de incluir dados*/
        estacaoClimaticaView.getjButtonIncluirDadosDoTempo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarClima();
            }
        });
        
        /*Listener para ver qual linha foi selecionada na tabela de registros*/
        estacaoClimaticaView.getjTableRegistros().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    linhaSelecionada_Registros = estacaoClimaticaView.getjTableRegistros().getSelectedRow();
                }
            }
        });

        /*Listener para quando o usuário apernou no botão de remover registro*/
        estacaoClimaticaView.getjButtonRemoverDados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerDadoClima();
            }
        }); 
    }
    
    /*MÉTODOS*/
    
    /*Operações com os painéis*/
    public void registrarPainel(IPainel painel){
        paineis.add(painel);
    }
    
    public void removerPainel(IPainel painel){
        paineis.add(painel);
    }
    
    /*Operações com os dados de clima*/
    public void cadastrarClima() {
        try {
            // Pegando dados dos jTextPane
            double temperatura = Double.parseDouble(estacaoClimaticaView.getjTextPaneTemperaturaIncluir().getText());
            double umidade = Double.parseDouble(estacaoClimaticaView.getjTextPaneUmidade().getText());
            double pressao = Double.parseDouble(estacaoClimaticaView.getjTextPanePressao().getText());

            // Converte a String da tela principal view em LocalDate
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(estacaoClimaticaView.getjTextPaneData().getText(), formatter);

            // Incluindo dados do clima
            DadoClima novoClima = new DadoClima(temperatura, umidade, pressao, data);
            incluirDadoClima(novoClima);
            
        } 
        catch (NumberFormatException e) {
            System.out.println("Erro ao converter um valor numérico: " + e);
            JOptionPane.showMessageDialog(null, "Verifique se os campos de temperatura, umidade e pressão contêm valores válidos.");
        } 
        catch (DateTimeParseException e) {
            System.out.println("Erro ao fazer o parsing da data: " + e);
            JOptionPane.showMessageDialog(null, "Verifique se a data está no formato correto (DD/MM/AAAA).");
        }
    }
    
    public void incluirDadoClima(DadoClima dadoClima){
        log.getLog().escrever("Incluir", dadoClima.toString());
        dadosClima.add(dadoClima);
        atualizarMedicoes();
        atualizaTabelaRegistros();
    }
    
    // Remover clima pela tela principal view
    public void removerDadoClima(){
        log.getLog().escrever("Remover", dadosClima.get(linhaSelecionada_Registros).toString());
        dadosClima.remove(linhaSelecionada_Registros);
        atualizarMedicoes();
        atualizaTabelaRegistros();
    }
    
    /*Operações internas*/
    private void atualizarMedicoes(){
        //dadosClima.clear();
        if (dadosClima.isEmpty()) {
            System.out.println("Nenhum dado climático disponível.");
            JOptionPane.showMessageDialog(null, "Nenhum dado climático disponível.");
            estacaoClimaticaView.limparTela();
        }
        try{
            notificarPaineis();
        }
        catch (RuntimeException e) {
            System.out.println("Ocorreu algum erro: " + e);
        }
    }
    
    private void notificarPaineis(){
        for(int i=0; i<paineis.size(); i++){
            paineis.get(i).atualizar(dadosClima, estacaoClimaticaView);
        }
    }
    
    // atualiza a tabela de registros
    private void atualizaTabelaRegistros() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) this.estacaoClimaticaView.getjTableRegistros().getModel();
            modelo.setNumRows(0);

            for(DadoClima clima: dadosClima) {
                String Data = clima.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String Temperatura = Double.toString(clima.getTemperatura());
                String Umidade = Double.toString(clima.getUmidade());
                String Pressao = Double.toString(clima.getPressao());
                
                modelo.addRow(new Object[]{
                    Data,
                    Temperatura,
                    Umidade,
                    Pressao,
                });
            }
        } catch(RuntimeException e) {
            System.out.println("Erro ao atualizar tabela de registros: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de registros: " + e);
        }
    }
    
    //Configura o tipo de arquivo para o Log (JSON ou XML)
    public void configuraLog() {
        String configuracao = (String) telaLog.getjComboBoxOpcoesLog().getSelectedItem();
        log = new Log(configuracao);
        telaLog.setVisible(false);
    }
}
