public class MongoDB implements Database {
    @Override
    public void insert() {
        System.out.println("MongoDB insert");
    }

    @Override
    public void update() {
        System.out.println("MongoDB update");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB delete");
    }
}
