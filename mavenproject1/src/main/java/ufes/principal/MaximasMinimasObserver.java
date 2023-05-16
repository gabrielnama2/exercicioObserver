package ufes.principal;
import java.util.ArrayList;

public class MaximasMinimasObserver implements IPainel{
    private ArrayList<DadoClima> dadosClima;

    public MaximasMinimasObserver() {
        dadosClima = new ArrayList();
    }
    
    @Override
    public void atualizar(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        exibirMaximasMinimas();
    }
    public void exibirMaximasMinimas(){
        System.out.println("Máximas e mínimas...");
    }
}
