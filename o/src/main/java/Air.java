import java.time.LocalDate;

public class Air implements Shipping {

    @Override
    public Integer getCost(Order order) {
        return order.getItemsCount() * 20;
    }

    @Override
    public LocalDate getDate(Order order) {
        return LocalDate.now().plusDays(10);
    }

}
