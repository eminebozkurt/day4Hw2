package Adapters;


import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisReference.ISJKPSPublicSoap;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        ISJKPSPublicSoap client = new ISJKPSPublicSoap();
        boolean isValid = false;

        try {
            isValid = client.TCKimlikNoDogrula(Long.parseLong(String.valueOf(customer.nationalityId)),
                    customer.firstName,
                    customer.lastName,
                    customer.dateOfBirth);

        } catch (NumberFormatException e) {
            e.printStackTrace();

        } catch (RemoteException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;

}

}
