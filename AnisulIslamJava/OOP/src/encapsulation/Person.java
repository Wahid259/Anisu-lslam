
package encapsulation;

public class Person {
    
    private String name;
    private int age;
    
    /*void display()
    {
        System.out.println("Namw : "+name);
        System.out.println("Age : "+age);
    }
    */
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
