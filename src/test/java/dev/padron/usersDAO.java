package dev.padron;

import entities.users;

public class usersDAOtests {

    static UsersDAO usersdao = newusersDAOpostgresimpl();

    @Test
    void createnewusers(int member_id, Object last_name, Object first_name) {
        users Smith = new users(id 0, last_name "Smith", first_name, "John");
        users savedusers= usersDAO.createusers(Smith);
        Assertions.assertnotequals (unexpected 0, savedusers.getID());

    }

    @Test
    void getusersbyID(){
        users retrievedusers= usersDAO.getusersbyID(2);
        System.outprintln(retrievedusers);
        Assertions.assertEquals(expected "Smith", retrievedusers.getlast_name);
    }
    @Test
    void createnewaccount() {

    }
    @Test
    void deposit (){

    }
    @Test
    void withdraw (){

    }
    @Test
    void viewaccountbalance (){

    }
}

