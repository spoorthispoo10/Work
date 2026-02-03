class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

class MathTeacher extends Teacher {
    MathTeacher(String name) {
        super(name);
    }

    void solveEquation() {
        System.out.println("Solving math equations.");
    }
}

class ScienceTeacher extends Teacher {
    ScienceTeacher(String name) {
        super(name);
    }

    void conductExperiment() {
        System.out.println("Conducting science experiment.");
    }
}
