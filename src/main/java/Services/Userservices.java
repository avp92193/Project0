package Services;

import entities.users;

import static APP.APP.usersservice;

public class UsersServiceImpl implements usersservice {
    private usersDAO usersDAO;

    users createusers (users users);

    users getuserbyid(int ID);

    users updateusers (users users);

    Boolean deleteusersbyID (int ID);



}
