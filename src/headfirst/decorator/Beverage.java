package headfirst.decorator;

public abstract class Beverage {

    private String menuName;
    private int price;

    public Beverage(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }

    public void printBeverageInfomation() {
        System.out.println("첨가물: "+ getMenuName());
        System.out.println("가격: " + getPrice());
        // 여기에서 인스턴트 변수에 접근하면 처음에
        // 콘크리트 컨테이너에 할당된 변수로 접근하기 때문에
        // 함수로 접근해야 한다.
    }
}
