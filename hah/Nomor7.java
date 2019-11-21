import java.util.Scanner;
class Nomor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println(add(x, y));
    }

    public static String add(String a, String b) {
        String result = "";
        String high = checkHigh(a,b);
        a = reverse(a);
        b = reverse(b);
        boolean added = false;
        for (int i = 0; i < high.length(); i++) {
            int first = getANumber(a,i);
            int second = getANumber(b,i);
            int sum = first + second;
            if (added){
                sum++;
            }
            String copyOfSum = inttoString(sum);
            if (sum > 9 && i!= high.length()-1){
                result = copyOfSum.charAt(copyOfSum.length()-1)+result;
                added = true;
            } else {
                result = sum+result;
                added = false;
            }
        }
        return result;
    }

    public static int chartoInt (char c){
        return Character.getNumericValue(c);
    }

    public static String inttoString (int number){
        return Integer.toString(number);
    }

    public static int stringtoInt (String number){
        return Integer.parseInt(number);
    }

    public static String reverse (String word){
        String result = "";
        for (int i = word.length()-1; i>=0;  i--) {
            result += word.charAt(i);
        }
        return result;
    }

    public static String checkHigh(String a, String b){
        if (a.length() > b.length()){
            return a;
        }
        return b;
    }

    public static int checkLow (String a, String b){
        int first = stringtoInt(a);
        int second = stringtoInt(b);
        if (first > second){
            return second;
        }
        return first;
    }

    public static int  getANumber (String number, int index){
        int result = 0;
        if (index < number.length()){
            result = chartoInt(number.charAt(index));
        }
        return result;
    }

}