package headfirst.singleton;

public class BoilerMain {

    public static void main(String[] args) {
        ChocolateBoiler boiler = new ChocolateBoiler();
        ChocolateBoiler boiler2 = new ChocolateBoiler();
        // 보일러는 하난데... 두 개?! 코드 짜다보면 안 이럴 거 같지만 자주 이래여ㅠㅠㅠ

        boiler.fill();
        boiler2.fill();
        //이러면 두 번 가득 채워서 망....ㅠ
    }
}
