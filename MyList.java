package genericDemo;

public class MyList<T> {
    public T[] arr;
    public T[] spareArr;

    public int capacity=10;

    public int size=0;
    public MyList() {
        arr = (T[]) new Object[capacity];

    }
    public MyList(int capacity) {
        this.capacity=capacity;
        arr = (T[]) new Object[capacity];
    }

    public void sparer(){
        this.spareArr=(T[]) new Object[capacity];
        for(int i=0; i<arr.length; i++){
            spareArr[i]=arr[i];
        }
        this.arr=this.spareArr;
    }

    public int size(){
        int count=0;
        for(T i:arr){
            if(i!=null){
                count++;
            }
        }
        this.size=count;
        return size;
    }

    public int getCapacity(){
      return capacity;
    };



    public  void add(T data){
        if(this.size()==this.capacity){
            capacity=capacity*2;
            this.sparer();
        }
        this.arr[this.size()]=data;
        System.out.println(data+ " eklendi");

    }

    public T get(int index){
        if(index>this.size() || index<0){
            return null;
        }
        return arr[index];
    }

    public T[] remove(int index){
        if(index>this.size()|| index<0){
            return null;
        }
        T[] listTepm2 = this.arr;
        this.arr[index] = null;
        for(int i=0;i<listTepm2.length-1;i++){
            if(index==0){
                this.arr[i]=listTepm2[i+1];
            }else if (index!=0 && i<index){
                this.arr[i] =listTepm2[i];
            } else if (index!=0 && i>=index ) {
                this.arr[i] = listTepm2[i+1];
            }
        }
        this.size--;
        return arr;
    }
    public void sToString(){
        for(T i: arr){
            System.out.println(i);
        }
    }

    public T[] set(int index, T data){
        if(index> arr.length|| index<0){
            return null;
        }else{
            this.arr[index]=data;
            return arr;
        }
    }

    public int indexOf(T data){
        int result=-1;
        for(int i=0; i<arr.length; i++){
            if(data==arr[i]){
                result=i;
                break;
            }
        }
        return result;
    }

    public int lastIndexOf(T data){
        int result=-1;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==data){
                result=i;
            }
        }
        return result;
    }

    public boolean isEmpty(){
        boolean checkEmpty=true;
        for(int i=0; i< arr.length; i++){
            if(arr[i]!=null){
                checkEmpty=false;
                break;
            }
        }
        return checkEmpty;
    }

    public void clear(){
         size=0;
         this.arr=(T[]) new Object[capacity];
         System.out.println("Liste temizlendi");
    }

    public MyList<T> subList(int start, int finish){
        if (start < 0 || start > size || finish < 0 || finish > size)
            return null;
        MyList<T> returnedList = new MyList<>(finish - start);

        for (int i = start; i < finish; i++) {
            returnedList.add(arr[i]);
        }

        return returnedList;
    }

    public boolean contains(T data){
        return indexOf(data) != -1;
    }

}
