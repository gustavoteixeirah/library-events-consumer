package dev.gustavoteixeira.libraryeventsconsumer.service;

import dev.gustavoteixeira.libraryeventsconsumer.domain.LibraryEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LibraryEventsService {

    public void processLibraryEvent(ConsumerRecord<Integer, LibraryEvent> event) {
        log.info("Event processed: {}.", event);
    }

}
