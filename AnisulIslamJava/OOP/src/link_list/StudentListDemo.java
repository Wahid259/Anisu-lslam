
package link_list;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        //student linkedlist
        LinkedList<Student> list = new LinkedList<Student>();
        
        //creating create
        Student s1 = new Student(101, "Karim", "Eleven");
        Student s2 = new Student(102, "Rahim", "Eleven");
        Student s3 = new Student(103, "Anis", "Eleven");
        Student s4 = new Student(104, "Mahbub", "Eleven");
        
        //adding student to the studentlist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        //information display
        for (Student s : list) 
        {
            System.out.println(s.id+" "+s.name+" "+s.className);
            
        }
    }
    
}
