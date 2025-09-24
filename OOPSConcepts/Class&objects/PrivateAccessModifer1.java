public class Main{
    public static void main(String [] args){
        Student s1 = new Student();
        
        s1.setName("Venkatesh");
        System.out.println(s1.getName());
    }
}

class Student{
    private String name;
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
}

