package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;

    }

    @Override
    public void Save(Customer customer) {

        if(_customerCheckService.checkIfRealPerson(customer)){
            super.Save(customer);
        }
        else{
            System.out.println("Not a valid person");
        }



    }

}
