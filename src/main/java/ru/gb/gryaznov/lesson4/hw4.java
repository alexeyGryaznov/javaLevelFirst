package ru.gb.gryaznov.lesson4;

import java.util.Random;
import java.util.Scanner;

public class hw4 {
    public static final char EMPTY = '.'; // символ пустого поля
    public static final char DotX =  'X'; // символ первого игрока
    public static final char DotO = 'O'; //символ второго игрока
    public static final int Size = 5; //размер поля
    public static final int PointToWin = 4; //условие победы
    public static char[][] feeld; // определение массива игрового поля (доступно везде)
    public static  int xHumTurn, yHumTurn; // переменные для записи хода человека, для анализа ИИ
    public static  int xCompTurn, yCompTurn; // переменные для записи хода компьютера, для анализа ИИ
public static void main(String[] args) {
    initFeeld(Size);//вызов метода создания и инициализации игрового поля
    printFeeld(Size);//печать поля в консоль
    while (true){
        HumanTurn();
        printFeeld(Size);
        if(checkWin(DotX)){
            System.out.println("Вы победили");
            break;
        }
        if(feeldFull()){
            System.out.println("Ничья");
            break;
        }
        compTurn();
        printFeeld(Size);
        if(checkWin(DotO)){
            System.out.println("Победил ИИ");
            break;
        }
        if(feeldFull()){
            System.out.println("Ничья");
            break;
        }
    }
    System.out.println("Игра окончена");
}
    public static void initFeeld(int s){
        feeld = new char[s][s];
        for(int i=0;i<s;i++){
            for (int j=0;j<s;j++){
                feeld[i][j] = EMPTY;
            }
        }
    }
    public static void printFeeld(int s){
        for(int i=0; i<=s;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
            for (int i=0;i<s;i++){
                System.out.print((i+1) + " ");
                for (int j=0; j<s;j++){
                    System.out.print(feeld[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println();
    }
    public static Scanner sc = new Scanner(System.in); //почему тут, а не в методе?
    public static void HumanTurn(){
    int x, y; //переменные координат
    do{
        System.out.println("укажите 2 координаты хода X Y");
        x = sc.nextInt()-1;
        y = sc.nextInt()-1;
    }while (!CheckSell(x,y));//если условия проверки не выполняются то возвращается false, но цикл работает по true. !
    feeld[x][y] = DotX;
    xHumTurn = x;
    yHumTurn = y;
    }
    public static boolean CheckSell(int x, int y){
        if(x<0 || x>=Size || y<0 || y>=Size ){
            return false;
        }
        if(feeld[x][y]==EMPTY){
            return true;
        }
        System.out.println("поле занято");
        return false;
    }
    public static Random rand = new Random();
    public static void compTurn(){
        int x, y;
        if(checkTurn(xHumTurn, yHumTurn)){
            System.out.println("поймал тебя");
        }else {
            do {
                x = rand.nextInt(Size);
                y = rand.nextInt(Size);

            } while (!CheckSell(x, y));
            System.out.println("Компьютер походил в " + (x + 1) + " " + (y + 1));
            feeld[x][y] = DotO;
            xCompTurn = x;
            yCompTurn = y;
        }
        }
        public static boolean checkTurn(int x, int y){// метод блокировки хода человека в тот же столбец или строку
        int i=0, j=0;
        int stolb = 0, stroka = 0;
        for(int k=0;k<Size;k++){ // считаем символы человека в столбце и строке
            if(feeld[k][y]==DotX){
                stolb=stolb+1;
            }
            if(feeld[x][k]==DotX){
                stroka=stroka+1;
            }
        }
        if(stroka>stolb){// если в строке крестиков больше чем в столбце
            //j = y - rand.nextInt(yHumTurn + 1); //выбираем случайную ячейку в строке
            for(j=y-2;j<Size;j++){
            if(j>=0 && feeld[x][j]==EMPTY) {// блокировка в строке
                feeld[x][j] = DotO;
                System.out.println("Компьютер походил в " + (x + 1) + " " + (j + 1));
                return true;
            }
            }
        }else{
            //i = x - rand.nextInt(xHumTurn + 1);// иначе пытаемся выбрать случайную ячейку в столбце
            for(i=x-2;j<Size;j++) {
                if (i >= 0 && feeld[i][y] == EMPTY) {// блокировка в столбце
                    feeld[i][y] = DotO;
                    System.out.println("Компьютер походил в " + (i + 1) + " " + (y + 1));
                    return true;
                }
            }
        }
            return false;
        }
    public static boolean checkWin(char symb){
        for(int i=0;i<Size;i++){   // проверка заполнения строк по колич символов игрока
            for (int j=0;j<Size;j++){
                int str=0;
                if(feeld[i][j]==symb){
                    int k=j;
                    while(k<Size && feeld[i][k]==symb){ // пробегаем от каждого вхождения нужного символа -считаем подряд в строках
                        str=str+1;
                        k=k+1;
                    }
                }
                if(str>=PointToWin){
                    return true;
                }
            }
        }
        for(int j= 0; j<Size; j++){ //проверка заполнения столбцов по колич символов игрока
            for(int i=0;i<Size;i++) {
                int colm=0;
                if (feeld[i][j] == symb) {
                    int k=i;
                    while(k<Size && feeld[k][j]==symb){ // пробегаем от каждого вхождения нужного символа -считаем подряд в столбцах
                        colm = colm + 1;
                        k=k+1;
                    }
                }
                if (colm >= PointToWin) {
                    return true;
                }
            }
        }
        for(int i=0;i<Size;i++){ // проверка заполнения главной и обратной диагонали (скорее всего надо разделить диаганали)
            int diagmain=0;
            int diagretur=0;
            for (int j=0;j<Size;j++){
                if(i==j) {
                    if (feeld[i][j] == symb) {
                        int k=i;
                        while(k<Size && feeld[k][k]==symb){ // пробегаем от каждого вхождения нужного символа -считаем подряд в главной диаг
                            diagmain = diagmain + 1;
                            k=k+1;
                        }
                    }
                }
                if(j == Size - (i+1)){
                    if (feeld[i][j] == symb) {
                        int k=j;
                        int m=i;
                        while(k<Size && m<Size && feeld[m][k]==symb){ // пробегаем от каждого вхождения нужного символа -считаем подряд в обратной диаг
                            diagretur = diagretur + 1;
                            m=m+1;//  порядок важен, т.к. перебор в обратную сторону
                            k=Size -(m+1);
                        }
                    }
                }
            }
        if(diagmain>=PointToWin ||diagretur>=PointToWin){
            return true;
            }
        }

    return false;
    }
    public static boolean feeldFull(){
        for (int i=0;i<Size;i++){
            for (int j=0;j<Size;j++){
                if(feeld[i][j] == EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

}
