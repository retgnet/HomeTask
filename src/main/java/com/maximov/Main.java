package com.maximov;

public class Main {
    public static void main(String[] args) {

        String[][] correctArray = new String[][]{
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}};
        String[][] incorrectArray = new String[][]{
                {"1","2","3","4"},
                {"1","2","3s","4"},
                {"1","2","3","4"},
                {"1","2","3","4f"}};

        try{
            int result = Math.sumElementsOfArray(correctArray);
            System.out.println("Сумма элементов: " + result);
            System.out.println(Math.sumElementsOfArray(incorrectArray));
        }catch (AppArraySizeException e){
            System.err.println("Ошибка размера массива! " + e.getMessage());
        }catch (AppArrayDataException e){
            System.err.println("Ошибка данных в массиве! " + e.getMessage());
        }


    }
}