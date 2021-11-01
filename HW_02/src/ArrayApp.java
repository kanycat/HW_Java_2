public class ArrayApp {
    public static void main(String[] args) {

        String [][] arrayCorrect = {{"1","2","3","4"}, {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String [][] arrayWrongSize = {{"1","2","3",}, {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String [][] arrayWrongSymbol = {{"1","2","3","A"}, {"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};


        try {
            System.out.println("Сумма всех элементов массива равна " + Integer.parseInt(String.valueOf(arraySum(arrayCorrect))));
        } catch (Exception e) {
            e.getMessage();
        }

        try {
            System.out.println("Сумма всех элементов массива равна " +Integer.parseInt(String.valueOf(arraySum(arrayWrongSize))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма всех элементов массива равна " + Integer.parseInt(String.valueOf(arraySum(arrayWrongSymbol))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static int arraySum (String [][] array) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;

        if (4 != array.length) throw new MyArraySizeException("Размер массива должна быть 4х4");
        for (int i = 0; i < array.length; i++) {
            if (4 != array[i].length) throw new MyArraySizeException("Размер массива должна быть 4х4");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }

        return sum;
    }

    }
