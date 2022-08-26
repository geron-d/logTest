package by.geron.server.log;

import by.geron.entity.Log;
import by.geron.entity.LogType;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class LogAPI {

    public List<Log> getLogsStatusWithNewValueNew(List<Log> logs) {
        return logs.stream()
                .filter(log -> log.getLogType().equals(LogType.STATUS))
                .filter(log -> log.getNewValue().equals("NEW"))
                .collect(Collectors.toList());
    }

}
