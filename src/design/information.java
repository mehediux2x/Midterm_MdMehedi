package design;

public abstract class information implements Employee {

    final String address= "37-06 Northern blvd, Astoria,NY 11224";

    static String retireDate = "01/19/2016";

    public void farewell () {

        System.out.println("Employee's last day was: "+retireDate);
    }


}
