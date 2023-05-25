package ufes.service;
import ufes.model.DadoClima;
import java.util.ArrayList;

public class MaximasMinimasObserver implements IPainel{
    private ArrayList<DadoClima> dadosClima;
    private ArrayList<DadoClima> maxMinDadosClima = new ArrayList();
    
    public MaximasMinimasObserver() {
        dadosClima = new ArrayList();
    }
    
    @Override
    public void atualizar(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        exibirMaximasMinimas();
    }
    
    public void exibirMaximasMinimas() {
        int maxTemperatura = 0;
        int minTemperatura = 0;
        int maxPressao = 0;
        int minPressao = 0;
        int maxUmidade = 0;
        int minUmidade = 0;

        for(int i = 1; i < dadosClima.size(); i++){
            if(dadosClima.get(maxTemperatura).getTemperatura() > dadosClima.get(i).getTemperatura()){
                maxTemperatura = i;
            }
            if(dadosClima.get(minTemperatura).getTemperatura() < dadosClima.get(i).getTemperatura()){
                minTemperatura = i;
            }
            if(dadosClima.get(i).getUmidade() > dadosClima.get(maxUmidade).getUmidade()){
                maxUmidade = i;
            }
            if(dadosClima.get(i).getUmidade() < dadosClima.get(minUmidade).getUmidade()){
                minUmidade = i;
            }
            if(dadosClima.get(maxPressao).getPressao() > dadosClima.get(i).getPressao()){
                maxPressao = i;
            }
            if(dadosClima.get(minPressao).getPressao() < dadosClima.get(i).getPressao()){
                minPressao = i;
            }
        }
        
        System.out.println("MÁXIMAS:" 
            + "\nTemperaturas: " + dadosClima.get(maxTemperatura).getTemperatura() + " - Data: " + dadosClima.get(maxTemperatura).getData()
            + "\nUmidade: " + dadosClima.get(maxUmidade).getUmidade() + " - Data: " + dadosClima.get(maxUmidade).getData()
            + "\nPressão: " + dadosClima.get(maxPressao).getPressao() + "-  Data: " + dadosClima.get(maxPressao).getData()
        );

        System.out.println("MÍNIMAS:" 
            + "\nTemperaturas: " + dadosClima.get(minTemperatura).getTemperatura() + " -  Data: " + dadosClima.get(minTemperatura).getData()
            + "\nUmidade: " + dadosClima.get(minUmidade).getUmidade() + " -  Data: " + dadosClima.get(minUmidade).getData()
            + "\nPressão: " + dadosClima.get(minPressao).getPressao() + " -  Data: " + dadosClima.get(minPressao).getData()
        );
    }
}
