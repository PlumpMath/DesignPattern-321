package headfirst.singleton;

public class ChocolateBoiler {

    private volatile static ChocolateBoiler uniqueBoiler;
    // DCL(Double Checking Locking) 사용

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getUniqueInstance() {
        if (uniqueBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueBoiler == null) {
                    uniqueBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("보일러에 가득 채우는 중~");
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("끓이고 있지~");
            boiled = true;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("부워줄겡~");
            empty = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
