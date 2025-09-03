package thymeleaf.webapp.sample.model.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class BooksDTO {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Genre genre;
    private String author;
    private LocalDate publicationDate;
    private String title;
}
