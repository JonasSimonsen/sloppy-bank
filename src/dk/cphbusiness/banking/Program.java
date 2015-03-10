package dk.cphbusiness.banking;

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
