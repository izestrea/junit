/**
 * Created on 0008, July, 8.
 */
public class MyStack {
    public MyStack(){
        stack = new String[100];
        nextIndex = 0;
    }
    public String pop(){
        return stack[--nextIndex];
    }
//    delete n items from the stack en-masse
    public void delete(int n) {
        nextIndex -= n;
    }
    public void push(String aString){
        stack[nextIndex++] = aString;
    }
    public String top(){
        return stack[nextIndex - 1];
    }
    
    private int nextIndex;
    private String[] stack;
}
