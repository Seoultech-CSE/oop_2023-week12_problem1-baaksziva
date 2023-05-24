import java.util.*;

public class week13_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 필요한 자료형을 넣어주세요
        ArrayList< __________ > list = new ArrayList< __________ >();
        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                int num = input.nextInt();
                list.add(num);
            } else {
                double num = input.nextDouble();
                list.add(num);
            }
        }

        sort(list);

        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
         list.sort(new Comparator<Number>() {
            @Override
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}
