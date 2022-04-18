package APP;

import java.util.Scanner;

public class APP {
    public static Usersservice usersservice= new usersserviceimpl(new usersDAO postgressImpl);
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Welcome to the bank");
        System.out.println ("1 create new user \n2. viewaccounts");
        System.out.println("Input choice");
        int.choice =scanner.nextInt();

        switch (choice){
            case 1:(
                    System.out.println("Input member ID");
                    String last_name = scanner.next();
                    String first_name = scanner.next();
                    Users users =new Users (id 0, last_name);
                    App.usersService.registerusers(last_name);
                    System.out.println("New users created +member_id");
                    ) break;
            case 2: (
                    List <users>users =usersservice.userscatalogue();
                    for(int i =0; i < users.size(); i++){
                        System.out.println(users.get(1));
                    }
                    )break;
            default


        }
    }
}
