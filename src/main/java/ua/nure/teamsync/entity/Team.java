package ua.nure.teamsync.entity;

import com.datastax.oss.driver.api.core.uuid.Uuids;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import ua.nure.teamsync.udts.PerformerUDT;
import ua.nure.teamsync.udts.TaskUDT;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Table
public class Team {
    @PrimaryKey
    private UUID teamId = Uuids.timeBased();
    private String teamName;
    private String managerName;
    private String phoneNumber;
    private LocalDate createdAt = LocalDate.now();
    @Column("tasks")
    private List<TaskUDT> tasks;
    @Column("team_members")
    private List<PerformerUDT> members;
}
