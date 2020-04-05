public class AppD {

    public static void main(String[] args) {
        Database mySQL = new MySQL();
        Database mongoDB = new MongoDB();

        new BudgetReport(mySQL).save();
        new BudgetReport(mongoDB).save();
    }

}
