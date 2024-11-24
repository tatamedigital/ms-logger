package br.com.tatame.logger.repo;


import br.com.tatame.logger.entity.LogEntry;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class InMemoryLogRepository {

    private final List<LogEntry> logs = new ArrayList<>();

    public void save(LogEntry logEntry) {
        logs.add(logEntry);
    }

    public List<LogEntry> findAll() {
        return Collections.unmodifiableList(logs);
    }
}
