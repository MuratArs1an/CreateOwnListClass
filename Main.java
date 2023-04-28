package genericDemo;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>();
        MyList<Integer> myNewList=new MyList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(20);
        myList.add(5);
        myList.add(20);


        //System.out.println(myList.size());
        //System.out.println(myList.getCapacity());
        //System.out.println(myList.get(10));
        //myList.remove(1);
        //myList.set(7,90);
        //System.out.println(myList.indexOf(20));
        //System.out.println(myList.lastIndexOf(20));
        //System.out.println(myList.isEmpty());
        //myList.clear();
        //myNewList=myList.subList(1,3);
        //myNewList.sToString();
        //myList.sToString();
        System.out.println(myList.contains(88));

    }

}
