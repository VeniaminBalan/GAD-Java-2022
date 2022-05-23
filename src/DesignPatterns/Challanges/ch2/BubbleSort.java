package DesignPatterns.Challanges.ch2;

public class BubbleSort implements SortingStrategy{
    @Override

    public void sort(Integer[] list) {
        int length = list.length;
        int temp = 0;
        for (int i= 0; i < length; i++) {
            for (int j = 0; j  < length - i - 1; j++) {
                if(list[j+1] < list[j]){
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
