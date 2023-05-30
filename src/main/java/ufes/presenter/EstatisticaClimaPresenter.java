package ufes.presenter;
//import java.text.DecimalFormat;
import ufes.model.DadoClima;
import java.util.ArrayList;
import ufes.view.EstacaoClimaticaView;

public class EstatisticaClimaPresenter implements IPainel{
    private ResultadoMediaClima resultadoMedia;
    
    public EstatisticaClimaPresenter() {
        
    }
    
    @Override
    public void atualizar(ArrayList<DadoClima> dadosClima, EstacaoClimaticaView estacaoClimaticaView) {
        resultadoMedia = calcularMedia(dadosClima);
        //Atualiza a view com o novo dado
        estacaoClimaticaView.preencherDadosMediaClima(String.valueOf(resultadoMedia.getTemperatura()), String.valueOf(resultadoMedia.getUmidade()), String.valueOf(resultadoMedia.getPressao()), String.valueOf(resultadoMedia.getNumRegistros()));
    }
    
    public ResultadoMediaClima calcularMedia(ArrayList<DadoClima> dadosClima){
        double somaTemperaturas = 0.0;
        double somaUmidades = 0.0;
        double somaPressoes = 0.0;

        for (int i = 0; i < dadosClima.size(); i++) {
            somaTemperaturas += dadosClima.get(i).getTemperatura();
            somaUmidades += dadosClima.get(i).getUmidade();
            somaPressoes += dadosClima.get(i).getPressao();
        }
        
        int tamanho = dadosClima.size();
//        System.out.println("Estatísticas Clima - Média Temperatura: " + (somaTemperaturas/tamanho)
//                + ", Média Umidade: " + (somaUmidades / tamanho)
//                + ", Média Pressão: " + (somaPressoes / tamanho));
        
        return new ResultadoMediaClima(somaTemperaturas/tamanho, somaUmidades/tamanho, somaPressoes/tamanho, dadosClima.size());
    }
}