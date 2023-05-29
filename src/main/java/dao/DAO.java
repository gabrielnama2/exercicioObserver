package dao;
import ufes.model.DadoClima;

public interface DAO {
    public void incluir(DadoClima dadoClima);
    public void remover(DadoClima dadoClima);
}
