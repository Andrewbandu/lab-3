public class Administrator extends Employee implements Workable,Service {
    private int hours; //кількість годин
    private double hourlyrate; //пгодинна ставка
    //конструктор
    public Administrator(String name, String surname, String department, boolean isMilitary, int hours, double hourlyrate) {
        super(name, surname, department, isMilitary);
        this.hours = hours;
        this.hourlyrate = hourlyrate;
    }
    //гетери сетери
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }
    //реалізація методу
    @Override
    public double calculateSalary() {
        return hours * hourlyrate;
    }

    @Override
    public String performDuties(){
        return "dfkgkjfhgk" ;
    }
    @Override
    public boolean isDuty(){
        return this.isMilitary();
    }
}
