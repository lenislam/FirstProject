package datastructurealgorithm.Array;

import org.w3c.dom.ls.LSOutput;

public class ArrayWithMethod {

    public static void main(String[] args) {
        int b[]={40,20,45,10,600,400,700,540};
        minimum (b);
        System.out.println("*******************");
        minimum(getArray());
        int arr[]=getArray();
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void minimum(int arr[]){
        int min=arr[0];
        for (int i=0; i<arr.length;i++){
           if (min>arr[i]){
               min=arr[i];
           }
        }
        System.out.println(min);
    }
    static int[] getArray(){ return new int []{34,56,20,79,50,90};}

}
