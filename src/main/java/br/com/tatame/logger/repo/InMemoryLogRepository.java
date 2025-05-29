package br.com.tatame.logger.repo;


import br.com.tatame.logger.entity.LogEntry;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class InMemoryLogRepository implements LogRepository {

    private final List<LogEntry> logs = new ArrayList<>();

    @Override
    public void save(LogEntry logEntry) {
        logs.add(logEntry);
    }

    @Override
    public List<LogEntry> findAll() {
        return Collections.unmodifiableList(logs);
    }
}
