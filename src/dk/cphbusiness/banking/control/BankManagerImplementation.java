/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.banking.control;

import dk.cphbusiness.banking.data.BankDataAccessor;
import dk.cphbusiness.banking.model.BaseCustomer;
import dk.cphbusiness.banking.model.Customer;

/**
 *
 * @author jonassimonsen
 */
public class BankManagerImplementation implements BankManager {
    private BankDataAccessor data;
    
    public BankManagerImplementation(BankDataAccessor data) {
        this.data = data;
    }

    @Override
    public int createCustomer(String name) {
        Customer customer = new BaseCustomer(0, name);
//        customer = BankDataAccessorStub.getInstance().saveCustomer(customer);
//        customer = BankDataAccessor.instance.saveCustomer(customer);
        customer = data.saveCustomer(customer);
        return customer.getId();
    }

    @Override
    public String createAccount(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean transferAmount(String sourceNumber, String targetNumber, int amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
