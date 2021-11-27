public class App {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList= new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        myList.getAll();

        MyArrayList<Integer> num = new MyArrayList<>();
        num.add(12);
        num.add(13);
        num.add(14);
        num.add(15);
        num.add(16);
        num.add(17);

        System.out.println(num.get(3));

    }
}
