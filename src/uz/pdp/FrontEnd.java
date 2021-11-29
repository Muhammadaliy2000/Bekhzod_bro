package uz.pdp;

import uz.pdp.model.User;
import uz.pdp.model.message.Message;
import uz.pdp.model.message.MessageStatus;
import uz.pdp.service.User_service.Block;
import uz.pdp.service.User_service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrontEnd {
    public static void home() {
        UserService userService = new UserService();

        int stepCode = -1;
        while (stepCode != 0) {
            System.out.println("1.Log in  2.Sign up");
            stepCode = new Scanner(System.in).nextInt();
            if (stepCode == 1) {
                System.out.println("Enter your phone number : ");
                String phone = new Scanner(System.in).nextLine();
                System.out.println("Password : ");
                String password = new Scanner(System.in).nextLine();
                User user = userService.logIn(phone, password);
                System.out.println(user.getName() + "\n");
                if (user != null) {
                    int stepCode1 = -1;
                    while (stepCode1 != 0) {
                        printMyRecentMessages(user, userService);

                        System.out.println("[-1].Add Contact [-2].Add Group [-3].Exit");
                        stepCode1 = new Scanner(System.in).nextInt();
                        if (stepCode1 > 0) {
//                            user.getChat().get()
                        }

                        if (stepCode1 == -1) {
                            System.out.println("Phone number : ");
                            String contact = new Scanner(System.in).nextLine();
                            User user1 = userService.get(contact);
                            if (user1 != null) {
                                user.getMyContacts().put(contact, Block.UNBLOCK);
                                List<Message> list = new ArrayList<>();
                                user.getChat().put(contact, list);
                            }
                        }
                        if (stepCode1 == -2) {

                        }
                    }
                }

            }
            if (stepCode == 2) {

                System.out.println("Enter phone number : ");
                String phone = new Scanner(System.in).nextLine();
                if (userService.get(phone) == null) {
                    System.out.println("Username : ");
                    String username = new Scanner(System.in).nextLine();
                    System.out.println("Password : ");
                    String password = new Scanner(System.in).nextLine();
                    User user = new User(username, phone, password);
                    userService.add(user);

                    for (User user1 : userService.list()) {
                        System.out.println(user1.getName() + " | " + user1.getPhone() + " | " + user1.getPassword());
                    }
                } else {
                    System.out.println("This phone number already registered");
                }
            }

        }

    }


    public static List<String> printMyRecentMessages(User user, UserService userService) {
        List<String> list = new ArrayList<>();
        for (String phone : user.getChat().keySet()) {
            int count = 0;
            list.add(phone);
            for (Message message : user.getChat().get(phone)) {
                if (message.getState() == MessageStatus.UNREAD) count++;
            }
            System.out.println("-------------------------------------------------------------------");
            System.out.println(userService.get(phone).getUsername() + "\t\t\t\t\t\t\t" + (count > 0 ? count : ""));

        }
        System.out.println("-------------------------------------------------------------------");
        return list;
    }
}