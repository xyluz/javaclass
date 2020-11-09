import java.util.Scanner;

public class Auth {

 
    public static String username;
    public static String password;
    public static Scanner inputFromUser;
    public static int loginAttemptLimit = 3;
    public static boolean loginSuccess = false;   
    public static int userSelectedOption; 
    public static String[] userDatabase = {"Seyi","Mike","Love"};
    public static String[] userPasswordDB = {"seyiPassword","mikePassword","lovePassword"};
    

    public static void main(String[] args){ 

        System.out.println("*** Welcome to a practice banking system (fake) ***");
        
       
        for(int i = 0; loginSuccess == false ; i++){


            if(i >= loginAttemptLimit ){
                //the user has tried to login too many times, lock them out.
                System.out.println("You have been lockedout for 1 hour");
                break;
            }

            inputFromUser = new Scanner(System.in);

            System.out.println("Username: ");
            username = inputFromUser.nextLine();

            System.out.println("Password: ");
            password = inputFromUser.nextLine();

            if(checkIfUserExists(username, password)){

                System.out.println("Welcome " + username);
                loginSuccess = true;

            }else{
                System.out.println("Username or Password Incorrect, please try again"); 
            }

        }

        if(loginSuccess){

            inputFromUser = new Scanner(System.in);

            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Enquiry");

            userSelectedOption = inputFromUser.nextInt();

            if(userSelectedOption == 1){
                
                System.out.println("How much would you like to deposit?");

            }else if(userSelectedOption == 2){

                System.out.println("How much would you like to withdraw?");

            }else if(userSelectedOption == 3){

                System.out.println("Your current account balance is: 800000");

            }else if(userSelectedOption == 4){

                System.out.println("What is the problem?");

            }else{

                System.out.println("Option not availale, please try again");

            }


        }

            


    }

    public static boolean checkIfUserExists(String name, String userPass){

        for(String singleUser : userDatabase){

            if(name.equals(singleUser)){

                for(String singleUserPassword : userPasswordDB){

                    if(password.equals(singleUserPassword)){
                        return true;
                    }

                }

            }
        }

        return false;

    }

}
