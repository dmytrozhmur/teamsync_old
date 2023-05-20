package ua.nure.teamsync.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table
public class Task {
    @PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
    private UUID performerId;
    @PrimaryKeyColumn(type = PrimaryKeyType.CLUSTERED)
    private Long taskNum;
    private String title;
    private String description;
    private String performerName;
    private String status;
    private LocalDateTime createTime = LocalDateTime.now();
}
