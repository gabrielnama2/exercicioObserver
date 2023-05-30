package ufes.adapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import ufes.adapter.ILog;

/**
 *
 * @author Danilo-Js
 */
public class LogJSON implements ILog {

    @Override
    public void escrever(String operation, String value) {
        // formata o log
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String logEntry = createLog(date, time, operation, value);
        // insere no DAO
    }

    // pega a string a ser inserida
    @Override
    public String createLog(String date, String time, String operation, String value) {
        StringBuilder builder = new StringBuilder();
        builder.append("{")
            .append("\"date\": \"").append(date).append("\",")
            .append("\"time\": \"").append(time).append("\",")
            .append("\"operation\": \"").append(operation).append("\",")
            .append("\"value\": \"").append(value).append("\"")
        .append("}");
        return builder.toString();
    }
}
