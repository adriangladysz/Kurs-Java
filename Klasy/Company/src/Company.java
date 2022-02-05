public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Kamil";
        employee1.lastname = "Kowalski";
        employee1.birthdate = 1995;
        employee1.seniority = "3 lata";

        System.out.println(employee1.name + " " + employee1.lastname + " urodzony w roku " + employee1.birthdate
                + " Staż pracy: " + employee1.seniority);

        Employee employee2 = new Employee();
        employee2.name = "Andrzej";
        employee2.lastname = "Nowak";
        employee2.birthdate = 1990;
        employee2.seniority = "5 lat";

        System.out.println(employee2.name + " " + employee2.lastname + " urodzony w roku " + employee2.birthdate
                + " Staż pracy: " + employee2.seniority);

        Employee employee3 = new Employee();
        employee3.name = "Anna";
        employee3.lastname = "Piątek";
        employee3.birthdate = 1990;
        employee3.seniority = "4 lata";

        System.out.println(employee3.name + " " + employee3.lastname + " urodzona w roku " + employee3.birthdate
                + " Staż pracy: " + employee3.seniority);

    }
}
