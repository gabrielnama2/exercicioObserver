package ufes.principal;
import java.time.LocalDate;

public class PainelClimaObserver implements IPainel{
    @Override
    public void atualizar(DadoClima dadoClima) {
        if(dadoClima.getData().isEqual(LocalDate.now())){
            System.out.println("Painel Clima - Data " + dadoClima.getData()
            + ", Temperatura: " + dadoClima.getTemperatura()
            + ", Umidade: " + dadoClima.getUmidade()
            + ", Pressão: " + dadoClima.getPressao());
        }
    }  
}
