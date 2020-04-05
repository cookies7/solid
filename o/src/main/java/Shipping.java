import java.time.LocalDate;

public interface Shipping {

    Integer getCost(Order order);

    LocalDate getDate(Order order);

}
