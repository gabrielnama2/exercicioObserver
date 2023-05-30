package ufes.presenter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import ufes.model.DadoClima;
import java.util.ArrayList;
import org.jfree.data.category.DefaultCategoryDataset;
import ufes.view.EstacaoClimaticaView;

public class MaximasMinimasPresenter implements IPainel {
    private ArrayList<ResultadoMaximasMinimasClima> resultadosMaxMin;
    private DefaultCategoryDataset dadosGrafico;

    public MaximasMinimasPresenter() {
        resultadosMaxMin = new ArrayList();
    }

    @Override
    public void atualizar(ArrayList<DadoClima> dadosClima, EstacaoClimaticaView estacaoClimaticaView) {
        resultadosMaxMin = calcularMaximasMinimas(dadosClima);
        //Exibe o gráfico vazio
        if(resultadosMaxMin.isEmpty()){
            estacaoClimaticaView.exibirGraficoVazio();
        }
        else{
            // Atualiza a view com os novos dados para o gráfico
            dadosGrafico = montarDadosGrafico(resultadosMaxMin);
            estacaoClimaticaView.exibirGrafico(dadosGrafico);
        }
    }

    public ArrayList<ResultadoMaximasMinimasClima> calcularMaximasMinimas(ArrayList<DadoClima> dadosClima) {
        ArrayList<ResultadoMaximasMinimasClima> resultados = new ArrayList<>();

        double maxTemperatura = 0;
        double minTemperatura = Double.MAX_VALUE;
        double maxPressao = 0;
        double minPressao = Double.MAX_VALUE;
        double maxUmidade = 0;
        double minUmidade = Double.MAX_VALUE;

        LocalDate dataMaxTemperatura = null;
        LocalDate dataMinTemperatura = null;
        LocalDate dataMaxPressao = null;
        LocalDate dataMinPressao = null;
        LocalDate dataMaxUmidade = null;
        LocalDate dataMinUmidade = null;

        for (DadoClima dado : dadosClima) {
            if (dado.getTemperatura() > maxTemperatura) {
                maxTemperatura = dado.getTemperatura();
                dataMaxTemperatura = dado.getData();
            }
            if (dado.getTemperatura() < minTemperatura) {
                minTemperatura = dado.getTemperatura();
                dataMinTemperatura = dado.getData();
            }
            if (dado.getUmidade() > maxUmidade) {
                maxUmidade = dado.getUmidade();
                dataMaxUmidade = dado.getData();
            }
            if (dado.getUmidade() < minUmidade) {
                minUmidade = dado.getUmidade();
                dataMinUmidade = dado.getData();
            }
            if (dado.getPressao() > maxPressao) {
                maxPressao = dado.getPressao();
                dataMaxPressao = dado.getData();
            }
            if (dado.getPressao() < minPressao) {
                minPressao = dado.getPressao();
                dataMinPressao = dado.getData();
            }
        }

        resultados.add(new ResultadoMaximasMinimasClima("Temperatura", "Máximo", maxTemperatura, dataMaxTemperatura));
        resultados.add(new ResultadoMaximasMinimasClima("Temperatura", "Mínimo", minTemperatura, dataMinTemperatura));
        resultados.add(new ResultadoMaximasMinimasClima("Umidade", "Máximo", maxUmidade, dataMaxUmidade));
        resultados.add(new ResultadoMaximasMinimasClima("Umidade", "Mínimo", minUmidade, dataMinUmidade));
        resultados.add(new ResultadoMaximasMinimasClima("Pressão", "Máximo", maxPressao, dataMaxPressao));
        resultados.add(new ResultadoMaximasMinimasClima("Pressão", "Mínimo", minPressao, dataMinPressao));

        return resultados;
    }

    public String formatarData(LocalDate data){
        //Formata a data para o padrão brasileiro
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = data.format(formatter);
        return dataFormatada;
    }
    
    private DefaultCategoryDataset montarDadosGrafico(ArrayList<ResultadoMaximasMinimasClima> resultados) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (ResultadoMaximasMinimasClima resultado : resultados) {
            String tipoDadoClima = resultado.getTipoDadoClima();
            String tipoInformacao = resultado.getTipoInformacao();
            double valor = resultado.getValor();
            
            //Formata a data para o padrão brasileiro
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = resultado.getData().format(formatter);

            if (tipoInformacao.equals("Máximo")) {
                dataset.addValue(valor, tipoDadoClima + " máxima: " + dataFormatada, tipoDadoClima);
            } else if (tipoInformacao.equals("Mínimo")) {
                dataset.addValue(valor, tipoDadoClima + " mínima: " + dataFormatada, tipoDadoClima);
            }
        }
        return dataset;
    }
}
