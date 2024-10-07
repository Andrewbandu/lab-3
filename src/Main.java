public class Main {
    public static void main(String[] args) {
        //створення обєкта класу
       Professor prof = new Professor("Ivan","Coco","dgdgdg", true,10,50.12);
        System.out.println("Зарплата професора " + prof.calculateSalary());
        System.out.println("обовязки" + prof.performDuties());
        System.out.println("lkglkdj" + prof.isDuty());

       Administrator admin = new Administrator("","","",false,10,10.12);
        System.out.println("зарплата адміністратора " + admin.calculateSalary());
        System.out.println("обовязки" + admin.performDuties());
        System.out.println("lkglkdj" + admin.isDuty());




    }
}