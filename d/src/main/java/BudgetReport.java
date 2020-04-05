public class BudgetReport {

    private Database database;

    public BudgetReport(Database database) {
        this.database = database;
    }

    public void save() {
        database.insert();
        database.update();
        database.delete();
    }

}
