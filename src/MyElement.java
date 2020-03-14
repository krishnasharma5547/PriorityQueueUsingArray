public class MyElement {
    private int data;
    private int priority;

    //constructor............

    public MyElement(int data,int priority) {
        this.data = data;
        this.priority = priority;
    }

    //getter and setter.............

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
