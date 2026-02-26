
import java.util.Scanner;

public class simpleQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        int ans = 0;

        ID IDstd = new ID();

        System.out.println(" -:////// Hello welcom to your math Quiz //////:- ");

        System.out.println("Please To advance Enter your ID : ");
        IDstd.IDS = input.nextInt();
        if (IDstd.IDS != 1234) {
            System.out.println("Sorry, but your ID is uncorrect :- ");

        }//end if 1
        else {

            System.out.println("Welcom " + IDstd.IDS + " " + "Please Enter your Password : ");

            IDstd.Password = input.nextInt();
            if (IDstd.Password != 1234) {
                System.out.println("Sorry, but your Password is uncorrect :-  ");
            }//end if 2
            else {

                System.out.println("///This Quiz has a four Multiple choice question (A/B/C/D) please solve the hole Quiz To See your resulte/// :- ");

                System.out.println("Question 1 : what is 1+1-1+1-1+2 ?");
                System.out.println("A. 3");
                System.out.println("B. 1");
                System.out.println("C. -1");
                System.out.println("D. -3");
                System.out.println(".()");
                String q1 = input.next().trim();
                switch (q1) {
                    case "A":
                        ans += 1;
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    case "D":
                        break;
                    default:

                }//end switch 1

                System.out.println("Question 2 : what is (2*3)^3");
                System.out.println("A. 200");
                System.out.println("B. 216");
                System.out.println("C. 222");
                System.out.println("D. 196");
                char q2 = input.next().charAt(0);

                switch (q2) {
                    case 'A':
                        break;
                    case 'B':
                        ans += 1;
                        break;
                    case 'C':
                        break;
                    case 'D':
                        break;
                    default:

                }
                System.out.println("Question 3 : what is 2+2");
                System.out.println("A. 3");
                System.out.println("B. 5");
                System.out.println("C. 4");
                System.out.println("D. 1");
                char q3 = input.next().charAt(0);

                switch (q3) {
                    case 'A':
                        break;
                    case 'B':
                        break;
                    case 'C':
                        ans += 1;
                        break;
                    case 'D':
                        break;
                    default:

                }
                System.out.println("Question 4 : what is 3+3");
                System.out.println("A. 9");
                System.out.println("B. 8");
                System.out.println("C. 7");
                System.out.println("D. 6");
                char q4 = input.next().charAt(0);

                switch (q4) {
                    case 'A':
                        break;
                    case 'B':
                        break;
                    case 'C':
                        break;
                    case 'D':
                        ans += 1;
                        break;
                    default:
                }

                if (ans >= 2) {
                    System.out.println("Congratulations, you passed! Your result is : " + ans+"/4");
                } else if (ans < 2) {
                    System.out.println("Unfortunately, you failed, Your result is : " + ans+"/4");

                }

            }//end else 2

        }//end else 1

    }//end void main 

}//end main class

class ID {

    int IDS;
    int Password;
}
