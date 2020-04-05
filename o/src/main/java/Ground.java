import java.time.LocalDate;

public class Ground implements Shipping {

    @Override
    public Integer getCost(Order order) {
        return order.getItemsCount() * 10;
    }

    @Override
    public LocalDate getDate(Order order) {
        return LocalDate.now().plusMonths(3);
    }

}
