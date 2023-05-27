package ufes.presenter;
import java.time.LocalDate;

public class ResultadoMaximasMinimasClima {
    private String tipoDadoClima;   //Temperatura, Umidade ou Pressão
    private String tipoInformacao;  //Máximo ou mínimo
    private double valor;
    private LocalDate data;

    public ResultadoMaximasMinimasClima(String tipoDadoClima, String tipoInformacao, double valor, LocalDate data) {
        this.tipoDadoClima = tipoDadoClima;
        this.tipoInformacao = tipoInformacao;
        this.valor = valor;
        this.data = data;
    }

    public String getTipoDadoClima() {
        return tipoDadoClima;
    }

    public String getTipoInformacao() {
        return tipoInformacao;
    }

    public double getValor() {
        return valor;
    }
    
    public LocalDate getData() {
        return data;
    }
}
