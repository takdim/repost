import java.util.*;
class lab2{
    static Scanner pew = new Scanner(System.in);
    public static void main(String[] args) {
        int num = pew.nextInt();
        boolean flag = false;
        
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(true);
        else
            System.out.println(false);
    }
}