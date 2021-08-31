/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmanagementsystem;

/**
 *
 * @author niran
 */
public class MergeSorter {
    //gets the array when called
    public static void sort(double[] array) {
        //checks the length of the array
        if (array.length <= 1) {
            return;
        }
        //creates an array of half of the length of the provided array
        double[] first = new double[array.length / 2];
        double[] second = new double[array.length - first.length];
        //storing the values of provided elements in the array
        System.arraycopy(array, 0, first, 0, first.length);
        //storing the remaining values of provided array
        for (int i = 0; i < second.length; i++) {
            second[i] = array[first.length + i];
        }
        //making a call to the sort method   
        sort(first);
        sort(second);
        //making a call to the merge method
        merge(first, second, array);
    }

    public static void merge(double[] first, double[] second, double[] a) {
        //declaration of local variables
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        //checking the length of the both the arrays and storing the respective values in array a
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        //iterating through the first array and storing the value in array a
        while(iFirst<first.length)
        {
            a[j]=first[iFirst];
            iFirst++;
            j++;
        }
        //iterating through the second array and storing the value in array a
        while(iSecond<second.length)
        {
            a[j]=second[iSecond];
            iSecond++;
            j++;
        }
    } 
}
