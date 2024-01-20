import java.util.*;

public class RockPaperScissors {
    public static void main(String args[]) {
        char ch;
        int pointsuser = 0, pointsCpu = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper and Scissors Game:-");
        System.out.println("Player Name:");
        String name = sc.nextLine();

        Random rand = new Random();

        int max = 3, min = 1;
        int cpuNum = rand.nextInt(max - min + 1) + min;
        // System.out.println(cpuNum);

        do {

            System.out.println("Press 1 to choose Rock");
            System.out.println("Press 2 to choose Scissors");
            System.out.println("Press 3 to choose Paper");
            int userNum = sc.nextInt();

           
            // int max = 3, min = 1;
            // int cpuNum = rand.nextInt(max - min + 1) + min;
            // // System.out.println(cpuNum);
            if (userNum == 1 || userNum == 2 || userNum == 3) {

                if (userNum != cpuNum) {

                    System.out.println("Comp chooses: " + cpuNum);

                    if (userNum == 1 && cpuNum == 2) { // rock win against scissor
                        System.out.println(name + " You WON");
                        pointsuser++;
                    } else if (userNum == 2 && cpuNum == 3) { // scissor win against paper
                        System.out.println(name + " You WON");
                        pointsuser++;
                    } else if (userNum == 3 && cpuNum == 1) { // paper win against rock
                        System.out.println(name + " You WON");
                        pointsuser++;
                    } else {
                        System.out.println(name + " You LOOSE");
                        pointsCpu++;
                    }
                } else {
                    System.out.println("You both choose same value: " + userNum + " " + cpuNum);
                }
            } else {
                System.out.println("Choose valid input");
                // break;
            }

            System.out.println("Want another game\ntype Yes for next game\nPress No to exit-");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        System.out.println(name + " points:" + pointsuser);
        System.out.println("Computer points: " + pointsCpu);
        if(pointsuser>pointsCpu) {
            System.out.println(name+" you win the set");
        }
        else if(pointsCpu==pointsuser){
            System.out.println("It's a Tie");
        }
        else {
            System.out.println("Comp won the set, "+name+" you loose, run the code again and try to win this time\n \tDeveloped by /\\ r a d h y a");
        }
        
        sc.close();
    }
}
