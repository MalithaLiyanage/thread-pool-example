package repositories;

import entities.Ticket;
import helpers.IdGenerator;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TicketRepository implements Runnable {
  private Ticket ticket;
  public TicketRepository(Ticket ticket) {
    this.ticket = ticket;
  }
  public synchronized void writeTicket() {
    String ticketId = IdGenerator.generateId();
    System.out.println(ticket.getCinemaName());
    try(Connection conn = dbUtils.DbConnection.getInstance().initConnection();
        Statement stmt = conn.createStatement();) {
      String writeQuery = String.format("INSERT INTO ticket VALUES ('%s', '%s', '%s', '%s', '%s');", ticketId, ticket.getSeatId(), ticket.getCustomerId(), ticket.getCinemaName(), ticket.getCenterName());
      stmt.executeUpdate(writeQuery);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    writeTicket();
  }
}
