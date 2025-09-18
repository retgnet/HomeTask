package com.maximov;

public class Math {


    public static int sumElementsOfArray(String[][] arr) throws AppArraySizeException, AppArrayDataException {

        if (arr.length != 4) {
            throw new AppArraySizeException("Ожидалось 4 строки, получено: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new AppArraySizeException( String.format("В строке %d ожидалось 4 столбца, получено: %d", i, arr[i].length));
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int number = Integer.parseInt(arr[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException( String.format("Некорректные данные в ячейке [%d][%d]: %s", i, j, arr[i][j]));
                }
            }
        }
        return sum;
    }
}
