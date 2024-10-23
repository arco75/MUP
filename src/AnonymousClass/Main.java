package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Human student = new Human(){
            @Override
            public String run() {
                return "Biegnę i biegnę...";
            }
        };
        System.out.println(student.run());
    }
}
