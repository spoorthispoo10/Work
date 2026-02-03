class Students {

    String name;
    int age;

    Students() {
        System.out.println("Default Constructor");
    }

    Students(String name) {
        this.name = name;
    }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("Spoorthi");
        Students s3 = new Students("Spoorthi", 20);
    }
}
