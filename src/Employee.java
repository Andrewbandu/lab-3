abstract class Employee {
   private String name; //імя працівника
   private String surname;//прізвище працівника
   private String department;//місце роботи
   private boolean isMilitary;// чи військовий
    //конструктор
    public Employee(String name, String surname,String department,boolean isMilitary){
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.isMilitary = isMilitary;

    }//абстрактний метод для розрахунку зарплати
    public abstract double calculateSalary();
    //гетери і сетери для полів
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;

    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public boolean isMilitary(){
        return isMilitary;
    }
    public void setIsMilitary(boolean isMilitary){
        this.isMilitary = isMilitary;
    }
}
