import java.util.*;

public class exam {

    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> data = new HashMap<String, Integer>();

    public void login() {
        data.put("NIKHIL_KUMTHEKAR", 8666);

        System.out.println("\n\n***********Please login below and attend the test*****************");
        String UserId;
        int password;
        System.out.println("CONTINUE TO LOGIN");
        System.out.println();
        System.out.print("Enter UserId : ");
        UserId = sc.next().toUpperCase(); // if someone enter username in lower case here it will
        // change into upper case
        System.out.print("Enter password : ");
        password = sc.nextInt();
        if (data.containsKey(UserId) && data.get(UserId) == password) {
            System.out.println("\nSUCCESSFULLY LOGIN");
            MenuBar();
        } else {
            System.out.println(" Login Failed !! ");
            System.out.println("Please check your username and password and try again !!");
            login();
        }
    }

    public void MenuBar() {
        int select;
        System.out.println("\n|| Choose the option from below ||");
        System.out.println();
        System.out.println("1.Update Profile and Password");
        System.out.println("2.Start  Exam");
        System.out.println("3.Logout");
        select = sc.nextInt();
        switch (select) {
            case 1:
                data = update();
                MenuBar();
                break;
            case 2:
                exam_que();
                MenuBar();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter Valid Choice");
        }
    }

    public HashMap<String, Integer> update() {
        String uUser;
        int upassword;
        System.out.println("Welcome to Update Profile");
        System.out.println("Enter Username");
        uUser = sc.next();
        if (data.containsKey(uUser)) {
            System.out.println("Enter new Password you to want to Update to your Profile");
            upassword = sc.nextInt();
            data.replace(uUser, upassword);
        } else {
            System.out.println("User Doesn't Exist");
        }
        return data;
    }

    public void exam_que() {
        long examtime = System.currentTimeMillis();
        long endtime = examtime + 30;
        int ans_count = 0;
        int ans, score;
        System.out.println("Start Your Exam Here");

        // Question starts
        while (System.currentTimeMillis() < endtime) {
            System.out.println("You have 30 seconds to answer 5 questions");
            System.out.println("Each Question carries 10 marks" + " " + "-5 for wrong answer");
            System.out.println("\n\nQ.1) Is Java a type of OS?");
            System.out.println("\n(1) YES" + "\t" + "(2) NO");

            System.out.println("Enter Correct Option");
            ans = sc.nextInt();
            System.out.println("Answer Locked...");
            if (ans == 2) {
                ans_count++;
            }
            System.out.println("\n\nQ.2)Who is the current prime minister of india?");
            System.out.println(
                    "1)Sharad Pawar" + "\t" + "2)Narendra Modi" + "\t" + "3)Eknath Shinde" + "\t" + "4)Droupadi Murmu");
            System.out.println("Enter correct option");
            ans = sc.nextInt();
            System.out.println("Answer Locked...");
            if (ans == 2) {
                ans_count++;
            }
            System.out.println("\n\nQ.3)Who was India’s first President?");
            System.out.println("1) Radha Krishnan" + "\t" + "(2) Zakir Hussain" + "\t" + "3)V. V. Giri" + "\t"
                    + "4)Rajendra Prasad");
            System.out.println("Enter correct option");
            ans = sc.nextInt();
            System.out.println("Answer Locked...");
            if (ans == 1) {
                ans_count++;
            }
            System.out.println("\n\nQ.4)Thor was the son of which God??");
            System.out.println("1) Tony Stark" + "\t" + "2) Loki" + "\t"
                    + "3) Thanos" + "\t" + "4)Odin");
            System.out.println("Enter correct option");
            ans = sc.nextInt();
            System.out.println("Answer Locked...");
            if (ans == 4) {
                ans_count++;
            }
            System.out.println("\n\nQ.5)What is long form of BGMI?");
            System.out.println("1) Battleground india mobile" + "\t" + "2) BattleGrow Mobile India" + "\t"
                    + "3) BattleGround Mobile India" + "\t" + " butterground Mobile India");
            System.out.println("Enter correct option");
            ans = sc.nextInt();
            System.out.println("Answer Locked...");
            if (ans == 3) {
                ans_count++;
            }
            break;
        }
        System.out.println("You have finished the exam");
        score = ans_count * 10 - ((5 - ans_count) * 5);
        System.out.println("Your score is..." + " " + score + "/50");
        if (score == 50) {
            System.out.println("Congratulations you got outoff marks");
        }
    }

    public static void main(String[] args) {
        exam log = new exam();
        log.login();
    }
}
