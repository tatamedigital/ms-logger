package br.com.tatame.logger.repo;

import br.com.tatame.logger.entity.LogEntry;

import java.util.List;

public interface LogRepository {
    void save(LogEntry logEntry);

    List<LogEntry> findAll();
}
