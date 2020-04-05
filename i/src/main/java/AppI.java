import model.Nokia;
import model.Sumsung;

public class AppI {

    public static void main(String[] args) {

        Nokia nokia = new Nokia();
        System.out.println(nokia.getAudiType());
        System.out.println("-----------");

        Sumsung sumsung = new Sumsung();
        System.out.println(sumsung.getAudiType());
        System.out.println(sumsung.getInternetType());
        System.out.println(sumsung.getWifiType());

    }

}