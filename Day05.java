public class Day05 {
    public static void main(String[] args){
        Employee[] employeesOfMyCompany = new Employee[5];
        employeesOfMyCompany[0]=new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        employeesOfMyCompany[1]=new Employee("Вася", "Врач", "вася@mailbox.com", 892312313, 3000000, 45);
        employeesOfMyCompany[2]=new Employee("Катя", "Повар", "катя@mailbox.com", 892312314, 100000, 25);
        employeesOfMyCompany[3]=new Employee("Антон", "Водитель", "антон@mailbox.com", 892312317, 2530000, 47);
        employeesOfMyCompany[4]=new Employee("Женя", "Строитель", "женя@mailbox.com", 892352312, 570030000, 33);
        for(int i=0;i<employeesOfMyCompany.length;i++)
            if(employeesOfMyCompany[i].getAge()>40)
                employeesOfMyCompany[i].getInformation();
    }
}
