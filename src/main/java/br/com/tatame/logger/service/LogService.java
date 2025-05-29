package br.com.tatame.logger.service;

import br.com.tatame.logger.entity.LogEntry;
import br.com.tatame.logger.repo.InMemoryLogRepository;
import br.com.tatame.logger.repo.LogRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {


    private final LogRepository logRepository;

    public LogService(
            @Value("${logger.database.type:in-memory}") String databaseType,
            List<LogRepository> repositories
    ) {
        this.logRepository = repositories.stream()
                .filter(repo -> repo.getClass().getSimpleName().toLowerCase().contains(databaseType))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid logger database type: " + databaseType));

    }

    public void addLog(LogEntry logEntry) {
        logRepository.save(logEntry);
    }

    public List<LogEntry> getAllLogs() {
        return logRepository.findAll();
    }
}
