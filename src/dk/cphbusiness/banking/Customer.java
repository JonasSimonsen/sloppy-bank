package dk.cphbusiness.banking;

import java.util.Collection;

public interface Customer {
  int getId();
  String getName();
  Account findAccount(String number);
  Collection<Account> listAccounts();
  void addAccount(Account account);
  }
