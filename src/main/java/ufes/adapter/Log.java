package ufes.adapter;

/**
 *
 * @author Danilo-Js
 */
public class Log {
    
    private ILog log;
    
    public Log(String configuracao) {
        setLog(configuracao);
    }

    public ILog getLog() {
        return log;
    }
    
    public void setLog(String configuracao) {
        if (configuracao.equals("XML")) {
            this.log = new LogXML();
        } else {
            this.log = new LogJSON();
        }
    }
}
