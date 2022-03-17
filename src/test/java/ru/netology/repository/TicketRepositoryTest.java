package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.data.Ticket;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {
    TicketRepository repository = new TicketRepository();
    Ticket ticket1 = new Ticket(1, 13000, "LED", "GOJ",180);
    Ticket ticket2 = new Ticket(2, 12000, "DME", "EGO",120);
    Ticket ticket3 = new Ticket(3, 12600, "KUF", "OGZ",130);
    Ticket ticket4 = new Ticket(4, 14200, "FRU", "RVH",190);
    Ticket ticket5 = new Ticket(5, 15600, "NUX", "KZN",230);
    Ticket ticket6 = new Ticket(6, 13400, "SKX", "SLY",200);
    Ticket ticket7 = new Ticket(7, 14000, "PKV", "PEZ",320);
    Ticket ticket8 = new Ticket(8, 11300, "NUX", "KZN",150);
    Ticket ticket9 = new Ticket(9, 18000, "VOZ", "VOG",110);
    Ticket ticket10 = new Ticket(10, 16000, "KZN", "URS",280);
    Ticket ticket11 = new Ticket(11, 10000, "LPK", "MMK",190);
    Ticket ticket12 = new Ticket(12, 9000, "NYM", "AER",140);

    @Test
    void shouldRemoveById() {
        repository.save(ticket1);
        repository.save(ticket2);
        repository.save(ticket3);
        repository.save(ticket4);
        repository.save(ticket5);
        repository.save(ticket6);
        repository.save(ticket7);
        repository.save(ticket8);
        repository.save(ticket9);
        repository.save(ticket10);
        repository.save(ticket11);
        repository.save(ticket12);
        repository.removeById(7);
        Ticket[] expected = new Ticket[]{ticket1, ticket2, ticket3, ticket4, ticket5, ticket6, ticket8, ticket9, ticket10, ticket11, ticket12};
        Ticket[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSortByPrice() {
    repository.save(ticket1);
    repository.save(ticket2);
    repository.save(ticket3);
    repository.save(ticket4);
    repository.save(ticket5);
    repository.save(ticket6);
    repository.save(ticket7);
    repository.save(ticket8);
    repository.save(ticket9);
    repository.save(ticket10);
    repository.save(ticket11);
    repository.save(ticket12);
    Ticket[] expected =  new Ticket[]{ticket12, ticket11, ticket8, ticket2, ticket3, ticket1, ticket6, ticket7, ticket4, ticket5, ticket10, ticket9};
    Ticket[] actual = repository.findAll();
    Arrays.sort(actual);
    assertArrayEquals(expected,actual);
    }
}