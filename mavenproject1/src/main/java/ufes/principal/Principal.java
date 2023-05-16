package ufes.principal;
import java.time.LocalDate;
import ufes.principal.*;

public class Principal {
    public static void main(String args[]){
        EstacaoClimatica estacaoClimatica = new EstacaoClimatica();
        
        IPainel painelClimaObserver = new PainelClimaObserver();
        IPainel estatisticaClimaObserver = new EstatisticaClimaObserver();
        IPainel maximaMinimasObserver = new MaximasMinimasObserver();
        
        estacaoClimatica.registrarPainel(painelClimaObserver);
        estacaoClimatica.registrarPainel(estatisticaClimaObserver);
        estacaoClimatica.registrarPainel(maximaMinimasObserver);
        
        estacaoClimatica.atualizarMedicoes(25.5f, 65f, 1013.1f, LocalDate.of(2023, 5, 15));
        estacaoClimatica.atualizarMedicoes(26.0f, 68f, 1012.5f, LocalDate.of(2023, 5, 16));
        estacaoClimatica.atualizarMedicoes(24.0f, 60f, 1015.5f, LocalDate.of(2023, 5, 17));
    } 
}
