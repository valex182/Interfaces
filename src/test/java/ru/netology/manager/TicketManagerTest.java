package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.data.Ticket;
import ru.netology.repository.TicketRepository;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    TicketRepository repository = new TicketRepository();
    TicketManager manager = new TicketManager(repository);
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
    void shouldFindByAirport() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        Ticket[] expected = new Ticket[]{ticket6};
        Ticket[] actual = manager.findByAirport("SKX", "SLY");
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAirportAndSort() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);
        Ticket[] expected = new Ticket[]{ticket8, ticket5};
        Ticket[] actual = manager.findByAirport("NUX", "KZN");
        assertArrayEquals(expected, actual);
    }
}