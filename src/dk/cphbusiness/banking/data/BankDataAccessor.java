/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.banking.data;

import dk.cphbusiness.banking.model.Customer;

/**
 *
 * @author jonassimonsen
 */
public interface BankDataAccessor {
   Customer saveCustomer(Customer customer);
   Customer findCustomer(int id);
   
}
