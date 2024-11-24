package br.com.tatame.logger.service;

import br.com.tatame.logger.entity.LogEntry;
import br.com.tatame.logger.repo.InMemoryLogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    private final InMemoryLogRepository logRepository;

    public LogService(InMemoryLogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void addLog(LogEntry logEntry) {
        logRepository.save(logEntry);
    }

    public List<LogEntry> getAllLogs() {
        return logRepository.findAll();
    }
}
