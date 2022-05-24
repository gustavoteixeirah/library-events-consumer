package dev.gustavoteixeira.libraryeventsconsumer.consumer;


import dev.gustavoteixeira.libraryeventsconsumer.domain.LibraryEvent;
import dev.gustavoteixeira.libraryeventsconsumer.service.LibraryEventsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class LibraryEventsConsumer {

    private final LibraryEventsService libraryEventsService;

    @KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecord<Integer, LibraryEvent> event) {
//    public void onMessage(String event) {
        log.info("Evento recebido com sucesso: {}", event);
        libraryEventsService.processLibraryEvent(event);
        log.info("Evento consumido com sucesso: {}", event);
    }

}
