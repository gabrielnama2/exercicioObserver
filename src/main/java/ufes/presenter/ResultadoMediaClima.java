package ufes.presenter;

public class ResultadoMediaClima {
    private double temperatura;
    private double umidade;
    private double pressao;
    private int numRegistros;

    public ResultadoMediaClima(double temperatura, double umidade, double pressao, int numRegistros) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        this.numRegistros = numRegistros;
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

    public int getNumRegistros() {
        return numRegistros;
    }
}
