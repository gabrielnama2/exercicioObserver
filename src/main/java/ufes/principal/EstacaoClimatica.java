package ufes.principal;
import java.time.LocalDate;
import java.util.ArrayList;

public class EstacaoClimatica {
    private ArrayList<IPainel> paineis;
            
    public EstacaoClimatica(){
        paineis = new ArrayList();
    }
    public void registrarPainel(IPainel painel){
        paineis.add(painel);
    }
    public void removerPainel(IPainel painel){
        paineis.add(painel);
    }
    public void atualizarMedicoes(double temperatura, double umidade, double pressao, LocalDate data){
        DadoClima dadoClima = new DadoClima(temperatura, umidade, pressao, data);
        notificarPaineis(dadoClima);
    }
    private void notificarPaineis(DadoClima dadoClima){
        for(int i=0; i<paineis.size(); i++){
            paineis.get(i).atualizar(dadoClima);
        }
    }
}
