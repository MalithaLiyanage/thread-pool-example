import entities.Customer;
import operations.CustomerOperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
  public static void main(String[] args) {
    Customer customer1 = new Customer("First", "asd@gmail.com");
    Customer customer2 = new Customer("Second", "asda@gmail.com");

    ExecutorService pool = Executors.newFixedThreadPool(2);

    CustomerOperation custOp1 = new CustomerOperation(customer1, pool);
    CustomerOperation custOp2 = new CustomerOperation(customer2, pool);
    CustomerOperation custOp3 = new CustomerOperation(customer2, pool);
    CustomerOperation custOp4 = new CustomerOperation(customer2, pool);
    CustomerOperation custOp5 = new CustomerOperation(customer2, pool);
    custOp1.bookTicket(1, "The lord", "Matara");
    custOp2.bookTicket(2, "Matrix Reloaded", "Galle");
    custOp2.bookTicket(3, "Matrix Reloade4", "Galle");
    custOp2.bookTicket(4, "Matrix Reloade3", "Colombo");
    custOp2.bookTicket(5, "Matrix Reloaded2", "Galle");

    pool.shutdown();

  }
}
