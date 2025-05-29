package br.com.tatame.logger.repo;

import br.com.tatame.logger.entity.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresLogRepository extends JpaRepository<LogEntry, Long> {
}
