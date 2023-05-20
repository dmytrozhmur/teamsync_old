package ua.nure.teamsync.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;
import ua.nure.teamsync.udts.TaskUDT;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Table
public class Performer {
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private UUID performerId = UUID.randomUUID();
    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED)
    private String login;
    private String name;
    private String phoneNumber;
    private Condition healthCondition = Condition.NORMAL;
    private Condition environmentCondition = Condition.NORMAL;
    private LocalDateTime registeredAt = LocalDateTime.now();
    @Column("assigned_tasks")
    private List<TaskUDT> tasks;

    public enum Condition {
        CRITICAL, BAD, NORMAL, GOOD
    }
}
