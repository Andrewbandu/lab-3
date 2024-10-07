public class Professor extends Employee implements Workable,Service {
    private int lectures; //кількість проведених лекцій
    private double rate; // ставка за лекцію
    //конструктор
    public Professor(String name, String surname,String department,boolean isMilitary,int lectures,double rate){
        super(name, surname,department, isMilitary);
        this.lectures = lectures;
        this.rate = rate;
    }
    //гетери сетери
    public int getLectures(){
        return lectures;
    }
    public void setLectures(int lectures){
        this.lectures = lectures;
    }
    public double getRate(){
        return rate;

    }
    public void setRate(double rate){
        this.rate = rate;
    }
    //реалізація методу
    @Override
    public double calculateSalary(){
        return lectures * rate; //зарплата = l * r
    }
    @Override
    public String performDuties(){
        return "jfgdljflgkjlfg";
    }
    @Override
    public boolean isDuty(){
        return this.isMilitary();
    }


}
