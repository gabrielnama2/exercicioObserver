package ufes.presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import ufes.model.DadoClima;
import ufes.view.ConfiguracaoSistemaView;
import ufes.view.EstacaoClimaticaView;

public class EstacaoClimaticaPrincipalPresenter {
    private EstacaoClimaticaView estacaoClimaticaView;
    private ConfiguracaoSistemaView telaLog;
    private ArrayList<IPainel> paineis;
    private ArrayList<DadoClima> dadosClima;

    private int linhaSelecionada_Registros; // linha selecionada na tabela de registros
    
    public EstacaoClimaticaPrincipalPresenter(){
        estacaoClimaticaView = new EstacaoClimaticaView();
        telaLog = new ConfiguracaoSistemaView();
        paineis = new ArrayList();
        dadosClima = new ArrayList();
        
        
        
        //Listener para a tela de Log
        estacaoClimaticaView.getjMenuLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fazerLog();
            }
        });

        //Listener para o botão salvar na tela de Log
        telaLog.getjButtonSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LOG: " + telaLog.getjComboBoxOpcoesLog().getSelectedItem());    //Opção selecionada na tela de log
                //Chama a classe que realiza o log passando a opção selecionada
                telaLog.setVisible(false);
            }
        });
        
        // Listener para o botão de incluir dados
        estacaoClimaticaView.getjButtonIncluirDadosDoTempo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarClima();
            }
        });
        
        // listener para ver qual linha foi selecionada na tabela de registros
        estacaoClimaticaView.getjTableRegistros().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    linhaSelecionada_Registros = estacaoClimaticaView.getjTableRegistros().getSelectedRow();
                }
            }
        });

        // listener para quando o usuário apernou no botão de remover registro
        estacaoClimaticaView.getjButtonRemoverDados().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerDadoClima();
            }
        });
    }
    
    // action para quado o usuário clica em "incluir" clima
    public void cadastrarClima() {
        try {
            // pegando dados dos jTextPane
            double temperatura = Double.parseDouble(estacaoClimaticaView.getjTextPaneTemperaturaIncluir().getText());
            double umidade = Double.parseDouble(estacaoClimaticaView.getjTextPaneUmidade().getText());
            double pressao = Double.parseDouble(estacaoClimaticaView.getjTextPanePressao().getText());

            // pegando a data e colocando no formato LocalDate
            String Data = estacaoClimaticaView.getjTextPaneData().getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(Data, formatter);
            // incluindo dados do clima

            DadoClima novoClima = new DadoClima(temperatura, umidade, pressao, data);
            System.out.println("NOVO DADO: " + novoClima);
            incluirDadoClima(novoClima);
        }  catch (Exception e) {
            System.out.println("Não foi possível gerar os dados do clima. Confira se a data está no formado dia/mês/ano e tente novamente!: " + e);
            JOptionPane.showMessageDialog(null, "Não foi possível gerar os dados do clima. Confira se a data está no formado dia/mês/ano e tente novamente!: " + e);
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
    
    /*Salva em log as operações com os dados*/
    public void fazerLog() {
        telaLog.setVisible(true);
        //Instancia a classe de Log
    }
    
    /*Operações com os painéis*/
    public void registrarPainel(IPainel painel){
        paineis.add(painel);
    }
    
    public void removerPainel(IPainel painel){
        paineis.add(painel);
    }
    
    /*Operações com os dados de clima*/
    public void incluirDadoClima(DadoClima dadoClima){
        dadosClima.add(dadoClima);
        atualizarMedicoes();
    }
    
    // clicou em remover dados
    public void removerDadoClima(){
        dadosClima.remove(linhaSelecionada_Registros);
        atualizarMedicoes();
    }
    
    /*Operações internas*/
    public void atualizarMedicoes(){
        atualizaTabelaRegistros();
        notificarPaineis();
    }
    
    private void notificarPaineis(){
        for(int i=0; i<paineis.size(); i++){
            paineis.get(i).atualizar(dadosClima, estacaoClimaticaView);
        }
    }
}
