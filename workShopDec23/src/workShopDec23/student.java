package workShopDec23;

public class student {

    int rno;
    String name;
    String branch;

     void display() {

        System.out.println("Reg " + rno);
        System.out.println("Name " + name);
        System.out.println("Branch " + branch);

    }

    public static void main(String[] args) {

        student ob = new student();
        ob.rno=10;
        ob.name="Madhu";
        ob.branch="Computers";
        ob.display();

    }
}