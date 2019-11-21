import java.util.*;
class lab2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("input bulan, hari, tahun");
        int a = pew.nextInt();
        int b = pew.nextInt();
        int c = pew.nextInt();
        
        find(a, b, c);
        System.out.println((String)find(a, b, c));
    }
    static String find(int month, int day, int year){
        String [] days ={"jum'at", "sabtu", "ahad", "senin", "selasa", "rabu", "kamis"};
        int [] months = {31, 28, 31, 30, 31, 30, 31 ,31, 30, 31,30, 31};
        int allDays = 0;
        for (int i = 2000; i < year; i++) {
            if( i%4 == 0){
                allDays++;
            }
            allDays += 365;
        }
        for (int i = 0; i < month - 1; i++) {
            if(i == 1 && year%4 ==0){
                allDays++;
            }
            allDays += months[i];
        }
        allDays += day;
        return days[allDays%7];
    }
}