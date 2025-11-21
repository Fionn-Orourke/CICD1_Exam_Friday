package org.example.cicd1_exam_friday1;
import org.apache.catalina.Service;
import org.example.cicd1_exam_friday1.ticket;
import jakarta.validation.Valid;
import jakarta.validation.Service.ticketService;
import org.example.cicd1_exam_friday1.ticketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;

import java.net.URI;
import java.security.Provider;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ticket")

public class ticketController {
    private final org.example.cicd1_exam_friday1.ticketService ticketController;

    public ticketController(org.example.cicd1_exam_friday1.ticketService service) {
        this.service =service;
    }


}
@GetMapping
public  ResponseEntity<List<ticket>> getALL(){return ResponseEntity.ok(org.example.cicd1_exam_friday1.ticketService.findAll())}
@GetMapping("/{id}")
public ResponseEntity <ticket> getOne(@PathVariable String id){

    new Optional( <ticket>maybe = Service.findById(id););
    if(maybe.isPresent()){
        return ResponseEntity.ok(maybe.get());
    }
    else {
        return ResponseEntity.notFound().build();
    }

}
@PostMapping
public ResponseEntity<ticket> create(@Valid @RequestBody ticket t){
    ticket created = Service.create(t);
    return ResponseEntity.created(java.net.URI.create("/api/ticket" +created.getTicketID())).body(created);
}