package ua.nure.teamsync.udts;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@UserDefinedType("task")
public class TaskUDT {
    private Long taskNum;
    private String title;
    private String description;
    private String status;
    private LocalDateTime createTime;
}
