public class MyTestingClass {
    private  int value;

    public MyTestingClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result + value;
        return result;
    }
}