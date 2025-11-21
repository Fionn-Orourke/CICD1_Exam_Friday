package org.example.cicd1_exam_friday1;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@lombok.Data @lombok.NoArgsConstructor @lombok.AllArgsConstructor @lombok.Builder
public class ticket {
    @NotBlank @Size(min=1, max=20)
    private String attendeename;
    @NotBlank @Size(min=1, max=30)
    private String email;
    @NotBlank @Pattern()
    private String ticketCode = @Pattern(regexp = "TK-[0-9]{4}")
    @NotBlank
    private int quantity;
    @NotBlank
    private int ticketId;
    public String getTicketID() {
        return "";
    }
}
