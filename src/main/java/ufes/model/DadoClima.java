package ufes.model;
import java.time.LocalDate;

public class DadoClima {
    private double temperatura;
    private double umidade;
    private double pressao;
    private LocalDate data;

    public DadoClima(double temperatura, double umidade, double pressao, LocalDate data) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.data = data;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public double getPressao() {
        return pressao;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    @Override
    public String toString() {
        return "Temperatura: " + Double.toString(this.getTemperatura()) + ", Umidade: " + Double.toString(this.getUmidade()) + ", Pressao: " + Double.toString(this.getPressao()) + ", Data: " + this.getData().toString();
    }
}
