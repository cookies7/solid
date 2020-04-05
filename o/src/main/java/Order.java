public class Order {

    private String[] items;

    private Shipping shipping;

    public Order(String[] items, Shipping shipping) {
        this.items = items;
        this.shipping = shipping;
    }

    public int getItemsCount() {
        return items.length;
    }

    public Integer getShippingCost() {
        return shipping.getCost(this);
    }

    public String getShippingDate() {
        return shipping.getDate(this).toString();
    }

}
