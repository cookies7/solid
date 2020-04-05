public class AppO {

    public static void main(String[] args) {
        String[] items = new String[] {"шкаф", "мяч", "стол"};

        Order order1 = new Order(items, new Ground());
        Integer cost1 = order1.getShippingCost();
        String date1 = order1.getShippingDate();
        System.out.println("стоимость: " + cost1 + ", дата: " + date1);

        Order order2 = new Order(items, new Air());
        Integer cost2 = order2.getShippingCost();
        String date2 = order2.getShippingDate();
        System.out.println("стоимость: " + cost2 + ", дата: " + date2);
    }

}
