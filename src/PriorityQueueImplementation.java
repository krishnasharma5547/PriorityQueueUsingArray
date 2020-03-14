public class PriorityQueueImplementation implements ADT {

    private int front;
    private int end;
    private MyElement arr[];

    //constructor............


    public PriorityQueueImplementation(int size) {
        front = -1;
        end = -1;
        arr = new MyElement[size];
    }

    public boolean isfull()
    {
        return end==arr.length+1;
    }
    public boolean isempty()
    {
        return front ==-1;
    }

    public void insert(int data, int p) {
        MyElement e = new MyElement(data,p);
        int i;
        if (isfull()) {
            System.out.println("Queue is full !");
        } else {
            if (front == -1) {
                front++;
                end++;
                arr[front] = e;
            }
            else{
                for(i = end; i>=front;i--){
                    if(e.getPriority() < arr[i].getPriority()){
                        arr[i+1] = arr[i];
                    }
                    else{
                        break;
                    }
                }
                arr[i+1] = e;
                end++;
            }
        }
    }

    //Method to display
    public void display(){
        if(isempty()){
            System.out.println("No element to print !");
        }
        else{
            for (int  i = front ;i<=end;i++){
                System.out.println(arr[i].getData() + " Priority = " + arr[i].getPriority());
            }
        }
    }

    public void dequeue(){
        if(isempty()){
            System.out.println("underflow");
        }
        else{
            arr[front].setData(0);
            arr[front].setPriority(0);
            front++;
        }
    }
}