import entities.users;

public interface usersDAO {
    users createusers (users users);

    users getuserbyid (int ID);

    users updateusers (users users);

    Boolean deleteusersbyID (int ID);

    List <users> userscatalogue(){

    }


}
