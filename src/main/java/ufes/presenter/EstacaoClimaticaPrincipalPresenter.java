package ufes.presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import ufes.model.DadoClima;
import ufes.view.ConfiguracaoSistemaView;
import ufes.view.EstacaoClimaticaView;
import ufes.view.JanelaErroView;

public class EstacaoClimaticaPrincipalPresenter {
    private EstacaoClimaticaView estacaoClimaticaView;
    private ConfiguracaoSistemaView telaLog;
    private JanelaErroView janelaErro;
    private ArrayList<IPainel> paineis;
    private ArrayList<DadoClima> dadosClima;
    
    public EstacaoClimaticaPrincipalPresenter(){
        estacaoClimaticaView = new EstacaoClimaticaView();
        telaLog = new ConfiguracaoSistemaView();
        janelaErro = new JanelaErroView();
        paineis = new ArrayList();
        dadosClima = new ArrayList();
        
        /*Listener para a tela de Log*/
        estacaoClimaticaView.getjMenuLog().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaLog.setVisible(true);
            }
        });

        /*Listener para o botão salvar na tela de Log*/
        telaLog.getjButtonSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LOG: " + telaLog.getjComboBoxOpcoesLog().getSelectedItem());    //Opção selecionada na tela de log
                //Chama a classe que realiza o log passando a opção selecionada
                telaLog.setVisible(false);
            }
        });
        
        /*Listener para fechar a mensagem de erro*/
        janelaErro.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janelaErro.setVisible(false);
            }
        });
    }
    
    /*Salva em log as operações com os dados*/
    private void fazerLog() {
        //Instancia a classe de Log
    }
    
    /*Operações com os dados de clima*/
    public void incluirDadoClima(DadoClima dadoClima){
        dadosClima.add(dadoClima);
        //fazerLog();
        atualizarMedicoes();
    }
    
    public void removerDadoClima(){
        //remove o dado
        //fazerLog();
    }
    
    /*Operações com os painéis*/
    public void registrarPainel(IPainel painel){
        paineis.add(painel);
    }
    
    public void removerPainel(IPainel painel){
        paineis.add(painel);
    }
    
    /*Operações internas*/
    private void atualizarMedicoes(){
        //dadosClima.clear();
        if (dadosClima.isEmpty()) {
            String mensagem = "Nenhum dado climático disponível.";
            janelaErro.exibirMensagemErro(mensagem);
            throw new RuntimeException(mensagem);
        }
        try{
            notificarPaineis();
        }
        catch (RuntimeException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
    
    private void notificarPaineis(){
        for(int i=0; i<paineis.size(); i++){
            paineis.get(i).atualizar(dadosClima, estacaoClimaticaView);
        }
    }
}
