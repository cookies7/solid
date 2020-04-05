public class MySQL implements Database {
    @Override
    public void insert() {
        System.out.println("MySQL insert");
    }

    @Override
    public void update() {
        System.out.println("MySQL update");
    }

    @Override
    public void delete() {
        System.out.println("MySQL delete");
    }
}
