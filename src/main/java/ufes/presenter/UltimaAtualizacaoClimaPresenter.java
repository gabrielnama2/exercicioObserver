package ufes.presenter;
import ufes.model.DadoClima;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import ufes.view.EstacaoClimaticaView;

public class UltimaAtualizacaoClimaPresenter implements IPainel {

    private DadoClima resultadoUltimaAtualizacao;

    @Override
    public void atualizar(ArrayList<DadoClima> dadosClima, EstacaoClimaticaView estacaoClimaticaView) {
        DadoClima ultimoDado = dadosClima.get(dadosClima.size() - 1);
        if (ultimoDado.getData().isEqual(LocalDate.now())) {
        System.out.println("Painel Clima - Data " + ultimoDado.getData()
            + ", Temperatura: " + ultimoDado.getTemperatura()
            + ", Umidade: " + ultimoDado.getUmidade()
            + ", Pressão: " + ultimoDado.getPressao());
        }
        
        //Formata a data para o padrão brasileiro
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = ultimoDado.getData().format(formatter);
        System.out.println(dataFormatada);
        
        //Atualiza a view com o novo dado
        estacaoClimaticaView.preencherDadosUltimaAtualizacao(String.valueOf(ultimoDado.getTemperatura()), String.valueOf(ultimoDado.getUmidade()), String.valueOf(ultimoDado.getPressao()), String.valueOf(dataFormatada));
    }
}
