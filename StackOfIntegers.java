public class StackOfIntegers {
    
    private int[] elements;
    private int size;
    
    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int size) {
        this.elements = new int[size];
    }

    public boolean empty(){
        if (size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return elements[size-1];
    }
    
    public void push(int value){
        elements[size] = value;
        size ++;
    }
    
    public int pop(){
        if(this.empty()){
            return 0;
        }
        else{
        int value = elements[size-1];
        elements[size-1] = 0;
        size --;
        return value;
        }
    }

    public int getSize(){
        return size;
    }
}