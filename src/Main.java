import Adapters.MernisServiceAdapter;
import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1,"sdas","asdsa",1993,"asd"));

    }
}
