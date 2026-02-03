class Student{
    String name;
    int age;
    double marks;
    public static void main(String[]args){
        Student s1 = new Student();
         s1.name = "Spoorthi";
         s1.age = 21;
         s1.marks = 100;
        
        Student s2 = new Student();
         s2.name = "Spoo";
         s2.age = 21;
         s2.marks = 99;
    
       
        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("Marks : "+s1.marks);
        
        System.out.println("--------------------");

        System.out.println("Name: "+s2.name);
        System.out.println("Age: "+s2.age);
        System.out.println("Marks : "+s2.marks);
    }
}

