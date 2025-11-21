package org.example.cicd1_exam_friday1;
import jakarta.validation.Valid;
import org.example.cicd1_exam_friday1.ticket;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
@Service
class TicketService {

}
public class ticketService {
    private final List<ticket> store = new ArrayList<>();
    public List<ticket> findAll() {
        return new ArrayList<>(store);
    }
    public Optional<ticket> findById(String id) {
        for (ticket t : store) {
            if (t.getTicketID().equals(id)) {
                return Optional.of(t);
            }
        }
        return Optional.empty();
    }
    public ticket create(ticket t) {
        if(findById(t.getTicketID()).isPresent()) {
            throw new IllegalArgumentException("ticket already exists");
        }
        store.add(t);
        return t;
    }
    ticket update(ticket t) {
        if(findById(t.getTicketID()).isPresent()) {
            throw new IllegalArgumentException("ticket not found");
        }
        store.add(t);
        return t;
    }
}
