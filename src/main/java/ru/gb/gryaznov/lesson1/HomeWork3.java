package ru.gb.gryaznov.lesson1;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] arg) {
        int[] arrFull = {1, 0, 1, 0, 1, 0, 0, 0, 1}; //  инициализация массив в котором будем менять 0 и 1
        changeArgs(arrFull);//вызов метода смены занчений в массиве
        int length = 100; // размер массива на 100 элементов
        int[] arrHundr = fullArr(length);//вызов функции заполнения массива.
        System.out.println(Arrays.toString(arrHundr));
        int arrMulti[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
        printArrMulti(arrMulti,6);//печать массива с удвоенными элементами меньше 6
        squarArr(6);//вызов метода заполнения диагоналей единицами
        int len = 5;
        int initialValue = 4;
        int[] arrFive = arr5(len,initialValue);
        System.out.print("одномерный массив по п.5 ");
        System.out.println(Arrays.toString(arrFive));
        System.out.println("Поиск мин-макс");
        searchElements(arrMulti);
        System.out.println("массив для проверки на равенство суммы левой и правой части:");
        int arrComp[] = {1, 5, 3, 2, 1, 6};
        boolean cmpSummElem = compearSummElements(arrComp);// пунк 7 дз
        System.out.println("результат проверки: " + cmpSummElem);
        int arrShift[] = {1, 2, 3, 4, 5, 6};
        int shift=-2;// положительное число-сдвиг влево
        arrShift(shift, arrShift);
//PULLrequest

    }
 public static int[] changeArgs(int[] arrStart){
    int[] arrDone = new int[arrStart.length];
     for(int i=0; i< arrStart.length; i++){
         if(arrStart[i] == 0){
             arrDone[i] = 1;
         }else{
             arrDone[i] = 0;
         }
     }
     System.out.println("Стартовый массив: " + Arrays.toString(arrStart));
     System.out.println("Новый     массив: " + Arrays.toString(arrDone));
  return arrDone;
 }
public static int[] fullArr(int lngth){
        int[] arr = new int[lngth];
        int i = 0;
        while(i<lngth){
            arr[i] = i+1;
            i++;
        }
        return arr;
}
public static void printArrMulti(int[] arr, int a){
    System.out.println("Стартовый массив: " + Arrays.toString(arr));
        for(int i=0; i<arr.length;i++){
            if(arr[i]<a){
                arr[i] = arr[i]*2;
            }
        }
    System.out.println("Новый    массив: " + Arrays.toString(arr));
}
public static void squarArr(int dim){
        int sqArr[][] = new int[dim][dim];
    System.out.println("массив пиратский");
        for(int i = 0;i<dim;i++){
            for(int j = 0;j<dim;j++) {
                if (i == j || j == dim-(i+1)){
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 0;
                }
                System.out.print(sqArr[i][j] + "  ");
            }
            System.out.println();
        }
}
public static int[] arr5(int ln, int val) {
    int arr[] = new int[ln];
    for (int i = 0; i < ln; i++) {
        arr[i] = val;
    }
    return arr;
}
public static void searchElements(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
    System.out.println(Arrays.toString(arr));
    System.out.println("максимальное значение в массиве: " + max);
    System.out.println("минимальное  значение в массиве: " + min);
}
public static boolean compearSummElements(int[] arr){
        boolean result=false;
int summAll = arr[0];
int left = 0;
int right=0;
int k=0;
for(int i=1;i< arr.length;i++){
    summAll = summAll + arr[i];
    }
int summEll=arr[0];
for(int j= 1;j< arr.length;j++){
    summEll=summEll + arr[j];
    if(summEll==(summAll-summEll)){
        result=true;
        k= j+1;
        left=summEll;
        right=(summAll-summEll);

    }
}
    System.out.println(Arrays.toString(arr));
    if(result == true){
        printDefArr(k, left, right, arr);
    }else{
        System.out.println("массив не делится т.к. плечи не равны");
    }
        return result;
}
public static void printDefArr(int k, int left, int right, int[]arr){
    System.out.println("разделение массива по сумме");
    for(int i=0;i<k;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.print("(" + left + ")");
    System.out.print(" = ");
    for (int i=k;i< arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.print("(" + right + ")");
    System.out.println();
    }
    public static void arrShift(int n, int[] arr){
        System.out.println("Стартовый массив для смещения: " + Arrays.toString(arr));
        if(n>0) {
            for (int i = 0; i < arr.length - n; i++) {
                int help = arr[i + n];
                arr[i + n] = arr[i];
                arr[i] = help;
            }
        }else{
            for (int i = arr.length-1; i > n*(-1)-1; i--) {
                int help = arr[i + n];
                arr[i + n] = arr[i];
                arr[i] = help;
            }
            n=n*(-1);
        }
        System.out.println("массив смещения со сдвигом: " + n + "  " + Arrays.toString(arr));
    }
}
