public class Main {
    public static void main(String[] args){
        // HelloWorld module
        System.out.println(Printer.PrintHello());

        //DataType module
        PrintMinMaxValue(Integer.MIN_VALUE, Integer.MAX_VALUE);
        PrintMinMaxValue(Byte.MIN_VALUE, Byte.MAX_VALUE);
        PrintMinMaxValue(Short.MIN_VALUE, Short.MAX_VALUE);
        PrintMinMaxValue(Long.MIN_VALUE, Long.MAX_VALUE);
        PrintMinMaxValue(Float.MIN_VALUE, Float.MAX_VALUE);
        PrintMinMaxValue(Double.MIN_VALUE, Double.MAX_VALUE);
    }

    private static void PrintMinMaxValue(Object minValue, Object maxValue){
        String type = minValue.getClass().getSimpleName();
        System.out.println("Min value of " + type + ": " + minValue);
        System.out.println("Max value of " + type + ": " + maxValue);
    }
}
