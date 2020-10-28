package oop;

public class Test {

    public static void main(String[] args) {

        //Teacher teacher1; //object declare
        Teacher teacher1 = new Teacher("Wahid Bin Mahbub", "male", 1670060508);//object create
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Umme Kulsum Komey", "female", 1671160508);//object create
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();

    }

}
