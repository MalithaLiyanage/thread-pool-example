package operations;

import entities.Customer;
import entities.Ticket;
import repositories.TicketRepository;

import java.util.concurrent.ExecutorService;

public class CustomerOperation {
  private Customer customer;
  private static ExecutorService pool;

  public CustomerOperation(Customer customer, ExecutorService pool) {
    this.customer = customer;
    this.pool = pool;
  }

  public void bookTicket(int seatId, String cinemaName, String centerName) {
    Ticket ticket = new Ticket(seatId, customer.getCustomerId(), cinemaName, centerName);
    Runnable ticketRepo = new TicketRepository(ticket);
    pool.execute(ticketRepo);
  }
}