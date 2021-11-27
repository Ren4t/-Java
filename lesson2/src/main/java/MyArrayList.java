public class MyArrayList<E> {
    E[] array;
    final int DEFAULT_SIZE=10;
    int count = 0;

    MyArrayList(){
        this.array = (E[])new Object[DEFAULT_SIZE];
    }

    void add(E value){
        array[count]=value;
        count++;
    }

    E get(int pos){
        return array[pos];
    }
}
