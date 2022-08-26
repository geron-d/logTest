package by.geron.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Log {

    Long id;

    String guid;

    LogType logType;

    String oldValue;

    String newValue;

}
