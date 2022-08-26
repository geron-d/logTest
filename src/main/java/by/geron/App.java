package by.geron;

import by.geron.entity.Log;
import by.geron.entity.LogType;
import by.geron.server.log.LogAPI;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LogAPI logAPI = new LogAPI();
        Log log1 = new Log(1L, "1", LogType.NAME, "OLD", "NEW");
        Log log2 = new Log(2L, "2", LogType.STEREOTYPE, "OLD", "NEW");
        Log log3 = new Log(3L, "3", LogType.STATUS, "OLD", "NEW");
        Log log4 = new Log(4L, "4", LogType.STATUS, "OLD", "OLD");
        Log log5 = new Log(5L, "5", LogType.NAME, "OLD", "OLD");
        Log log6 = new Log(6L, "6", LogType.STATUS, "NEW", "NEW");
        List<Log> logs = List.of(log1, log2, log3, log4, log5, log6);
        List<Log> logsNew = logAPI.getLogsStatusWithNewValueNew(logs);
        logsNew.forEach(System.out::println);
    }
}
