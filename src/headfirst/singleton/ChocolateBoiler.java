package headfirst.singleton;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    public ChocolateBoiler() {
        empty = true;
        boiled = false;
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
