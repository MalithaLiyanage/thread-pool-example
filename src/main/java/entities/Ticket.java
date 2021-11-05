package entities;

public class Ticket {
  private String ticketId;
  private int seatId;
  private int customerId;
  private String cinemaName;
  private String centerName;

  public Ticket(int seatId, int customerId, String cinemaName, String centerName) {
    this.seatId = seatId;
    this.customerId = customerId;
    this.cinemaName = cinemaName;
    this.centerName = centerName;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getTicketId() {
    return ticketId;
  }

  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }

  public int getSeatId() {
    return seatId;
  }

  public void setSeatId(int seatId) {
    this.seatId = seatId;
  }

  public String getCinemaName() {
    return cinemaName;
  }

  public void setCinemaName(String cinemaName) {
    this.cinemaName = cinemaName;
  }

  public String getCenterName() {
    return centerName;
  }

  public void setCenterName(String centerName) {
    this.centerName = centerName;
  }


}
