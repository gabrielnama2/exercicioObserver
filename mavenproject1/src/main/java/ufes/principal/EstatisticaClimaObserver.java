package ufes.principal;
import java.util.ArrayList;

public class EstatisticaClimaObserver implements IPainel{
    private ArrayList<DadoClima> dadosClima;

    public EstatisticaClimaObserver() {
        dadosClima = new ArrayList();
    }
    
    @Override
    public void atualizar(DadoClima dadoClima) {
        dadosClima.add(dadoClima);
        exibirMedia();
    }
    public void exibirMedia(){
        double somaTemperaturas = 0;
        double somaUmidades= 0 ;
        double somaPressoes = 0;
        for(int i=0; i<dadosClima.size(); i++){
            somaTemperaturas += dadosClima.get(i).getTemperatura();
            somaUmidades += dadosClima.get(i).getUmidade();
            somaPressoes += dadosClima.get(i).getPressao();
        }
        int tamanho = dadosClima.size();
        System.out.println("Estatísticas Clima - Média Temperatura: " + (somaTemperaturas/tamanho)
                + ", Média Umidade: " + (somaUmidades / tamanho)
                + ", Média Pressão: " + (somaPressoes / tamanho));
    }
}