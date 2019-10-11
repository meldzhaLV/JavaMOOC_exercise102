
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    private final ArrayList<Integer> scores;
    private final ArrayList<Integer> grades;
    private int five;
    private int four;
    private int three;
    private int two;
    private int one;
    private int zero;

    public Grades() {
        this.scores = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public ArrayList<Integer> returnScores() {
        return this.scores;
    }

    public ArrayList<Integer> returnGrades() {
        return this.grades;
    }

    public void getScores(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            } else {
                this.scores.add(score);
            }
        }
    }

    public void printScores() {
        for (Integer points : this.scores) {
            System.out.println(points);
        }
    }

    public void getGrades() {
        for (Integer grade : this.scores) {
            if (grade >= 50 && grade <= 60) {
                grade = 5;
                this.five++;
                this.grades.add(grade);
            } else if (grade >= 45 && grade <= 49) {
                grade = 4;
                this.four++;
                this.grades.add(grade);
            } else if (grade >= 40 && grade <= 44) {
                grade = 3;
                this.three++;
                this.grades.add(grade);
            } else if (grade >= 35 && grade <= 39) {
                grade = 2;
                this.two++;
                this.grades.add(grade);
            } else if (grade >= 30 && grade <= 34) {
                grade = 1;
                this.one++;
                this.grades.add(grade);
            } else if (grade >= 0 && grade <= 29) {
                grade = 0;
                this.zero++;
                this.grades.add(grade);
            }
        }
    }

    public void printGrades() {
        for (Integer grade : this.grades) {
            System.out.println(grade);
        }
    }

    public void gradeDistribution() {
        System.out.println("Grade distribution: ");
        int nFive = 0;
        int nFour = 0;
        int nThree = 0;
        int nTwo = 0;
        int nOne = 0;
        int nZero = 0;
        System.out.print("5: ");
        for (Integer count : this.grades) {
            while (nFive < this.five) {
                System.out.print("*");
                nFive++;
            }

        }
        System.out.println("");
        System.out.print("4: ");
        for (Integer count : this.grades) {
            while (nFour < this.four) {
                System.out.print("*");
                nFour++;
            }
        }
        System.out.println("");
        System.out.print("3: ");
        for (Integer count : this.grades) {
            while (nThree < this.three) {
                System.out.print("*");
                nThree++;
            }
        }
        System.out.println("");
        System.out.print("2: ");
        for (Integer count : this.grades) {
            while (nTwo < this.two) {
                System.out.print("*");
                nTwo++;
            }
        }
        System.out.println("");
        System.out.print("1: ");
        for (Integer count : this.grades) {
            while (nOne < this.one) {
                System.out.print("*");
                nOne++;
            }
        }
        System.out.println("");
        System.out.print("0: ");
        for (Integer count : this.grades) {
            while (nZero < this.zero) {
                System.out.print("*");
                nZero++;
            }
        }
    }

    public void acceptPercentage() {
        System.out.println("");
        double sumAccepted = 0;
        double sumAll = 0;
        for (Integer accepted : this.grades) {
            if (accepted != 0) {
                sumAccepted++;
            }
            sumAll++;
        }
        double percents = (100 * sumAccepted) / sumAll;
        System.out.println("Acceptance percentage: " + percents);
    }

}
