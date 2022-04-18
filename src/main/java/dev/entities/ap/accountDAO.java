package dev.entities.ap;

import entities.account;

public interface accountDAO {
    account createaccount (account account);

    account getaccountbyID (int ID);

    account updateaccount (account account);

    Boolean deleteaccountbyID (int ID);
}
