package com.maximov;

public class Math {


    public void sumElementsOfArray(String[][] arr) throws AppArraySizeException {

        if (arr.length != 4) {
            throw new AppArraySizeException("Ожидалось 4 строки, получено: " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new AppArraySizeException(
                        String.format("В строке %d ожидалось 4 столбца, получено: %d", i, arr[i].length));
            }
        }

    }
}
