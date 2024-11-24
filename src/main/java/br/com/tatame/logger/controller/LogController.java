package br.com.tatame.logger.controller;

import br.com.tatame.logger.entity.LogEntry;
import br.com.tatame.logger.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    @Autowired
    private LogService logService;


    @PostMapping
    public ResponseEntity<String> addLog(@RequestBody String logEntry) {
        LogEntry request = new LogEntry(logEntry);
        logService.addLog(request);
        return ResponseEntity.ok("Log added successfully");
    }

    @GetMapping
    public List<LogEntry> getLogs() {
        return logService.getAllLogs();
    }
}
