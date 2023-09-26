package ra.bt03;

public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        int[] number = new int[100000];

        for (int i = 0; i <number.length ; i++) {
            number[i] = (int) (Math.random()*100000);
        }
        stopwatch.start();
        selectionsort(number);
        stopwatch.stop();
        System.out.println("Thời gian thực hiện" + stopwatch.getElapsedTime());


    }
    public static void selectionsort(int[] number){

        for (int i = 0; i < number.length-1; i++) {
            for (int j = 1; j < number.length; j++) {
                if(number[i] < number[j]){
                   int temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }
        }
    }


}
