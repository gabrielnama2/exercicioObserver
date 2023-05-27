package ufes.presenter;
import java.util.ArrayList;
import ufes.model.DadoClima;
import ufes.view.EstacaoClimaticaView;

public interface IPainel {
    public void atualizar(ArrayList<DadoClima> dadosClima, EstacaoClimaticaView estacaoClimaticaView);
}
