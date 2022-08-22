public class Main {
    public static void main(String[] args) {
        int year = 2024;
        boolean yearVis = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if(yearVis){
            System.out.println("Год является високосным");
        }else {
            System.out.println("Год не является високосным");
        }
    }
}