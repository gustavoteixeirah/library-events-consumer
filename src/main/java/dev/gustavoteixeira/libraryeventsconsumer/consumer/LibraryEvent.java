package dev.gustavoteixeira.libraryeventsconsumer.consumer;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LibraryEvent {
    enum LibraryEventType {
        NEW,
        UPDATE
    }

    private Integer libraryEventId;
    private LibraryEventType libraryEventType;
    @NotNull
    private Book book;

}

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
class Book {
    @NotNull
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
}
