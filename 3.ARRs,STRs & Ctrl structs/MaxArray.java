public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum Element: "+max);
    } 
}
