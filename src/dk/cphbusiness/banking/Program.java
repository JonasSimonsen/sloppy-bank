package dk.cphbusiness.banking;

import dk.cphbusiness.banking.model.Account;
import dk.cphbusiness.banking.model.DepositAccount;
import dk.cphbusiness.banking.model.BaseCustomer;
import dk.cphbusiness.banking.model.CustomerAccount;
import dk.cphbusiness.banking.model.UnsufficientFundsException;
import dk.cphbusiness.banking.model.Customer;
import dk.cphbusiness.banking.model.Bank;
import dk.cphbusiness.banking.model.BaseAccount;
import dk.cphbusiness.banking.model.BaseBank;

public class Program {
  
  public static void main(String[] args) throws UnsufficientFundsException {
    Bank bank = new BaseBank("Snyd og svindel");
    Account a11 = new BaseAccount("#4711", bank);
    Account a12 = new BaseAccount("#4712", bank);
    a11.transfer("#4712", 200);
    Customer kurt = new BaseCustomer(1, "Kurt Hansen");
    Account a13 = new CustomerAccount("#4713", bank, kurt);
    a13.transfer("#4712", 300);
    Account a14 = new DepositAccount("#4714", bank, kurt);
    a14.transfer("#4712", 400);
    }
  
  }
