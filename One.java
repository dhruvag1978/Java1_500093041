class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Dhruv", 2345, 65000f);
        e.returname();
        e.returnsal();
        e.Increasesal(30);
        Employee e1 = new Employee();
        e1.returname();
        e1.returnsal();
        e1.Increasesal(25);
    }
}
class Employee {
    String name;
    int empid;
    float salary;
    Employee() {
    this.name = "Siddhanth";
    this.empid = 3245;
    this.salary = 45000f;
    }
Employee(String n, int eid, float s) 
{
    this.name = n;
    this.empid = eid;
    this.salary = s;
}
void returname() {
    System.out.println(this.name);
}
void returnsal() {
    System.out.println(this.salary);

}
void Increasesal(float perc) {
    this.salary += (salary*perc)/100;
    System.out.println("Increased Salary: " + this.salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String n, int eid, float s, String dept) {
        this.name = n;
        this.empid = eid;
        this.salary = s;
        this.department = dept;
    }
}

