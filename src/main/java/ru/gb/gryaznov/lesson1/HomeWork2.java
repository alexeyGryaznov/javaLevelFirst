package ru.gb.gryaznov.lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        int firstNum = 10; //первое число для сравнения суммы
        int secondNum = 8; // второе число для сравнения суммы
      boolean resultCheckSumm=checkSumm(firstNum,secondNum); //вызов метода с присвоением
        System.out.println(resultCheckSumm);
        int numForCheck = -5; //число для проверки положительное или отрицательное
        checkNum(numForCheck);
        int posOrNeg = 0; //число для проверки отрицательное или нет с возвратом значения функцией
        boolean resultLogic = checkNumLogic(posOrNeg);
        System.out.println("Это число отрицательное? " + posOrNeg + " - " + resultLogic);
    }
public static boolean checkSumm(int a,int b){
    boolean result;
    System.out.println("сумма=" + (a+b));
        if((a+b)>=10 && (a+b)<=20){result=true;}
else {result=false;}
    return result;
}
public static void checkNum(int a){
    System.out.println("проверяемое число=" + a);
    if(a<0){
    System.out.println("Это отрицательное цисло");
    }else {
    System.out.println("Это положительное число");
    }
}
public static boolean checkNumLogic(int a){
        boolean result;
if(a<0){result=true;}else{result=false;}
return result;
}
}
