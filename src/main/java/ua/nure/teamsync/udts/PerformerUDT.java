package ua.nure.teamsync.udts;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import ua.nure.teamsync.entity.Performer;

import java.util.List;

@Data
@UserDefinedType("performer")
public class PerformerUDT {
    private String name;
    private Performer.Condition healthCondition = Performer.Condition.NORMAL;
    private Performer.Condition environmentCondition = Performer.Condition.NORMAL;
    private List<TaskUDT> tasks;
}
