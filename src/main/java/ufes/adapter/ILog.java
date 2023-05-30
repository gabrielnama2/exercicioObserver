package ufes.adapter;

/**
 *
 * @author Danilo-Js
 */
public interface ILog {
    // realiza o log
    public void escrever(String operacao, String valorDadoClima);

    // pega a string a ser inserida
    public String createLog(String date, String time, String operation, String value);
}
