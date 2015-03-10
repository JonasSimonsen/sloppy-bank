/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.banking.control;

/**
 *
 * @author jonassimonsen
 */
public interface BankManager {
    int createCustomer(String name);
    String createAccount(int customerId);
    boolean transferAmount(String sourceNumber, String targetNumber, int amount);
    
}
