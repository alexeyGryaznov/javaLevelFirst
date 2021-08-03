package ru.gb.gryaznov.lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        int firstNum = 10; //первое число для сравнения суммы
        int secondNum = 8; // второе число для сравнения суммы
      boolean resultCheckSumm=checkSumm(firstNum,secondNum); //вызов метода с присвоением
        System.out.println(resultCheckSumm);
        int numForCheck = -5; //число для проверки положительное или отрицательное
        checkNum(numForCheck);
        int posOrNeg = 3; //число для проверки отрицательное или нет с возвратом значения функцией
        boolean resultLogic = checkNumLogic(posOrNeg);
        System.out.println("Это число отрицательное? " + posOrNeg + " - " + resultLogic);
        String str = "Домашка2"; // строка для печати n-раз
        int strRepit = 3;// сколько раз печатать
        printStr(str,strRepit);// метод печати строки
        int year = 1200;
        boolean checkYr = checkYear(year);
        System.out.println(checkYr);
        if(checkYr == true){
            System.out.println(year + " - високосный");
        }else {
            System.out.println(year + "- не високосный");
        }
// строка для pullrequest
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
public static void printStr(String a, int b){
        switch (b){
            case 0:
                System.out.println("Эта строка: " + a + " НЕ будет напечатана т.к. введен 0");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Эта строка: " + a + " будет напечатана "+ b + " раза:");
                break;
                default:
                System.out.println("Эта строка: " + a +" будет напечатана "+ b + " раз:");
        }
    System.out.println();
    for(int i=0; i<b; i++){
        System.out.println(a);
    }
}
public static boolean checkYear(int a){
boolean result = false;
switch (a%100) {
    case 0:
        if (a % 400 == 0 && a % 4 == 0) {
            result = true;
        }
        break;
    default:
        if (a % 4 == 0) {
            result = true;
        } else {
            result = false;
        }
}
return result;
}
}
