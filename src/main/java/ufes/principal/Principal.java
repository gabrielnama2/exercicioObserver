package ufes.principal;
import java.time.LocalDate;
import ufes.model.DadoClima;
import ufes.presenter.EstacaoClimaticaPrincipalPresenter;
import ufes.presenter.EstatisticaClimaPresenter;
import ufes.presenter.IPainel;
import ufes.presenter.MaximasMinimasPresenter;
import ufes.presenter.UltimaAtualizacaoClimaPresenter;

public class Principal {
    public static void main(String args[]){
        EstacaoClimaticaPrincipalPresenter estacaoClimatica = new EstacaoClimaticaPrincipalPresenter();
        
        IPainel ultimoDadoClimaPainel = new UltimaAtualizacaoClimaPresenter();
        IPainel estatisticaClimaPainel = new EstatisticaClimaPresenter();
        IPainel maximaMinimasPainel = new MaximasMinimasPresenter();

        estacaoClimatica.registrarPainel(ultimoDadoClimaPainel);
        estacaoClimatica.registrarPainel(estatisticaClimaPainel);
        estacaoClimatica.registrarPainel(maximaMinimasPainel);
        
        estacaoClimatica.incluirDadoClima(new DadoClima(25.5f, 35f, 53.1f, LocalDate.of(2023, 5, 15)));
        estacaoClimatica.incluirDadoClima(new DadoClima(26.0f, 38f, 52.5f, LocalDate.of(2023, 5, 16)));
        estacaoClimatica.incluirDadoClima(new DadoClima(27.3f, 30f, 52.8f, LocalDate.of(2023, 5, 17)));
        estacaoClimatica.incluirDadoClima(new DadoClima(25.8f, 33f, 54.2f, LocalDate.of(2023, 5, 18)));
        estacaoClimatica.incluirDadoClima(new DadoClima(23.5f, 38f, 56.7f, LocalDate.of(2023, 5, 19)));
        estacaoClimatica.incluirDadoClima(new DadoClima(26.7f, 49f, 42.0f, LocalDate.of(2023, 5, 20)));
        estacaoClimatica.incluirDadoClima(new DadoClima(24.9f, 42f, 45.1f, LocalDate.of(2023, 5, 21)));
        estacaoClimatica.incluirDadoClima(new DadoClima(25.6f, 46f, 43.8f, LocalDate.of(2023, 5, 22)));
        estacaoClimatica.incluirDadoClima(new DadoClima(27.1f, 41f, 42.3f, LocalDate.of(2023, 5, 23)));
        estacaoClimatica.incluirDadoClima(new DadoClima(24.0f, 40f, 45.5f, LocalDate.now()));
    }
}
