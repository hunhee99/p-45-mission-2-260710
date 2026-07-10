public class Main {
    public static void main(String[] args) {
        String orderNum = "번 주문 ";
        String sucess = "성공, 남은 재고: ";
        String fail = "실패, 재고 없음";
        int stock = 5;

        for (int i = 1; i <= 10; i++){
            if (stock - i >= 0){
                System.out.println(i + orderNum + sucess + (stock - i));
                continue;
            }
            System.out.println(i + orderNum + fail);
        }

    }
}