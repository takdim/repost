import java.util.Scanner;
class lab6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah bilangan");
        String[] numbers = new String[input.nextInt()];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = Integer.toString(input.nextInt());
        }
        int [] mode = new int[2];
        /*
         * mode[0] berfungsi sebagai penyimpanan modus
         * mode[1] berfungsi sebagai penyimpanan jumlah angka yang termasuk didalam modus itu
         */
        for(int i=0;i<numbers.length;i++){
            int[] memory = new int[2];
            /*
             * memory[0] berfungsi sebagai penyimpanan angka yang ingin dicek
             * memory[1] berfungsi sebagai penyimpanan jumlah angka yang termasuk didalamangka yang ingin dicek itu
             */
            if(numbers[i]!=null){
                memory[0] = Integer.parseInt(numbers[i]);
                memory[1] = 0;
            }else{
                continue;
            }
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==null){
                    continue;
                }else{
                    if(Integer.parseInt(numbers[j]) == memory[0]){
                        memory[1]++;
                        numbers[i] = null;
                    }
                }
            }
            if(memory[1]>mode[1] || (memory[1]>=mode[1] && memory[0]>mode[0])){
                mode[0] = memory[0]; 
                mode[1] = memory[1];
            }
        }
        System.out.println(mode[0]);
    }
}