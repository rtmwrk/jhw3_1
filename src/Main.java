public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        // var massBodKg - масса тела в кг, допускается дробная часть
        float massBodKg = (float) 98;
        // var highBodMetr - рост человека в метрах, допускается дробная часть
        float highBodMetr = (float) 1.87;

        // var bmi - индекс масы тела человека, округленная до целого числа
        int bmi = service.calculate(massBodKg, highBodMetr); // должно получиться 500
        System.out.println(bmi);
    }
}