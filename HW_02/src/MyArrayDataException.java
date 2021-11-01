public class MyArrayDataException extends Exception{
    public int i;
    public int j;

    public MyArrayDataException(int i, int j) {
        super(String.format("Неверные данные в ячейке [%d, %d]\n", i, j));

    }
}
