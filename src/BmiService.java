public class BmiService {

    public int calculate(float massBodyKg, float highBodyMetr) {
        // var indexBody - расчет массы тела по формуле:
        // масса тела в кг разделить на квадрат роста человека
        int indexBody = (int) (massBodyKg / (highBodyMetr * highBodyMetr));

        return indexBody;
    }
}
