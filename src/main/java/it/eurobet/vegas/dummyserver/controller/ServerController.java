package it.eurobet.vegas.dummyserver.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class ServerController {

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestBody String data) {
        return ResponseEntity.ok("Unimplemented! Received:"+data);
    }

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok("Service ok");
    }

}
