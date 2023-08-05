package org.Selcuk;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting arraySorting = new ArraySorting();
        //arraySorting.sort();
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
//        arraySorting.sort(quickSort);
//        arraySorting.sort(bubbleSort);


        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quicksort = ()-> System.out.println("Quick sorting...");
        arraySorting.sort(quickSort);

        Sorting bubblesort = ()-> System.out.println("Bubble sorting...");
        arraySorting.sort(bubbleSort);
    }

    private void sort(Sorting sorting) {
       sorting.sort();
    }
}
