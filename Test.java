package BrainRingGame;

public class Test {
    public static void main(String[] args) {
        Scholar s1 = new Scholar("Ivan", 13);
        Scholar s2 = new Scholar("Mariya", 15);
        Scholar s3 = new Scholar("Sergey", 12);
        Scholar s4 = new Scholar("Olya", 14);

        Student st1 = new Student("Nikolay", 20);
        Student st2 = new Student("Kseniya", 18);

        Employee e1 = new Employee("Zaur", 32);
        Employee e2 = new Employee("Mikhail", 47);

        Team<Scholar> scholarTeam = new Team<>("Dragons");
        scholarTeam.addNewParticipant(s1);
        scholarTeam.addNewParticipant(s2);

        Team<Scholar> scholarTeam2 = new Team<>("Wizards");
        scholarTeam.addNewParticipant(s3);
        scholarTeam.addNewParticipant(s4);

        Team<Student> studentTeam = new Team<>("Go-Go-Go");
        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Workers From Hell");
        employeeTeam.addNewParticipant(e1);
        employeeTeam.addNewParticipant(e2);

        scholarTeam.playWith(scholarTeam2);
    }
}
