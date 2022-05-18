public class DataTypeInformation {
    public static void main(){
        MinMaxValue(Integer.MIN_VALUE, Integer.MAX_VALUE);
        MinMaxValue(Byte.MIN_VALUE, Byte.MAX_VALUE);
        MinMaxValue(Short.MIN_VALUE, Short.MAX_VALUE);
        MinMaxValue(Long.MIN_VALUE, Long.MAX_VALUE);
        MinMaxValue(Float.MIN_VALUE, Float.MAX_VALUE);
        MinMaxValue(Double.MIN_VALUE, Double.MAX_VALUE);
    }

    public static void MinMaxValue(Object minValue, Object maxValue){
        String type = minValue.getClass().getSimpleName();
        System.out.println("Min value of " + type + ": " + minValue);
        System.out.println("Max value of " + type + ": " + maxValue);
    }
}
