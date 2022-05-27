import javax.swing.JOptionPane;
import java.io.FileWriter;

class Student {
    String name, brach;
    int Roll, percent;

    void storedata(String name, String brach, int Roll, int percent) {
        this.name = name;
        this.brach = brach;
        this.Roll = Roll;
        this.percent = percent;
    }

    void display() {
        JOptionPane.showMessageDialog(null,
                "Student NFame: " + name + "\nBrach: " + brach + "\n Roll No: " + Roll + "\n Percentage: " + percent);
        // String storeprint = "Student Name: " + name + "\nBrach: " + brach + "\n Roll
        // No: " + Roll + "\n Percentage: " + percent;
        // System.out.println(storeprint);

    }
}   

public class Sakshi {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "This is student details storeing program");
        int numberOfStudent = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Student"));
        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.println("Student No.: " + i);
            Student Std = new Student();

            String namejo = JOptionPane.showInputDialog(null, "Enter your Name");
            String Brachjo = JOptionPane.showInputDialog(null, "Enter your Brach");
            int Rolljo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Roll No."));
            int Percentjo = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your Percent"));

            Std.storedata(namejo, Brachjo, Rolljo, Percentjo);
            Std.display();
            try {
                // String store[] = new String[numberOfStudent];
                // for (int j = 0; j < numberOfStudent; j++) {
                // store [j] = namejo;
                // // System.out.println("namejo"+store[j]);

                // store [j] = Brachjo;
                // // System.out.println("Brachjo"+store[j]);

                // String rollstring = String.valueOf(Rolljo);
                // store [j] = rollstring;
                // // System.out.println("rollstring"+store[j]);

                // String percentstring = String.valueOf(Percentjo);
                // store [j] = percentstring;
                // // System.out.println("Percent"+store[j]);
                // }

                for (int k = 1; k < numberOfStudent; k++) {

                    FileWriter fw = new FileWriter("f:\\testout.txt");
                    String storedinfileName = "Name: " + namejo + "\n";
                    String storedinfileBrach = "Brach: " + Brachjo + "\n";
                    String storedinfileRolljo = "Roll No: " + Rolljo + "\n";
                    String storedinfilePercentjo = "Percent: " + Percentjo + "\n";
                    fw.write(storedinfileName);
                    fw.write(storedinfileBrach);
                    fw.write(storedinfileRolljo);
                    fw.write(storedinfilePercentjo);

                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Success...");
        }
    }
}