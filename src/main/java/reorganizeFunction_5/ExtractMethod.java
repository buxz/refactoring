package reorganizeFunction_5;

/**
 * Created by SQ_BXZ on 2018-12-03.
 *  提炼函数
 */
public class ExtractMethod {

    private String _name;

    public void printOwing(double amount){
        printBanner();
        // print details
        System.out.println("name: " +_name);
        System.out.println("amount: " +amount);

    }

    private void printBanner() {
    }
}
