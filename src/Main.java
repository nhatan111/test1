public class Main {
    public static void main(String[] args) {
        double radius = 5;
        double area = Math.PI * radius * radius;
        System.out.printf("Diện tích hình tròn bán kính %.2f là: %.2f%n", radius, area);

        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.printf("Tổng từ 1 đến %d là: %d%n", n, sum);
    }
}
