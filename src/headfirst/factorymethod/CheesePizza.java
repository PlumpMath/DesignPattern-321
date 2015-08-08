package headfirst.factorymethod;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        super("CheesePizza", new String[]{"Cheese", "tomato sauce"});
//        super("CheesePizza", {"Cheese", "tomato sauce"});
        // 위처럼 뉴 스트링을 하지 않으면 슈퍼를 로딩할 수는 없네요ㅜ.
    }
}
