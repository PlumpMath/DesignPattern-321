package headfirst.singleton;

public class BoilerMain {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
        ChocolateBoiler boiler2 = ChocolateBoiler.getUniqueInstance();

        System.out.println(boiler);
        System.out.println(boiler2);
        // 주소값을 비교해보면 같은 boiler와 boiler2가 같은 레퍼런스를 가리키고 있음을 알 수 있다.

        boiler.fill();
        boiler2.fill();
        // 두 번 채우는 코드를 넣어도 한 번만 작동한다.
        boiler.boil();
        boiler.drain();

        boiler2.fill();
        boiler.boil();
        // 이렇게 변수를 왔다갔다 하더라도 가리키는 인스턴스는 동일하니, 정상적으로 작동한다.
        // 다만 이런 코드는.... 별로 좋지 않다...ㅠ
        boiler2.drain();
    }
}
