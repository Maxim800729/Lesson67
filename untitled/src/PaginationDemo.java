
import java.util.*;

public class PaginationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.print("Enter total movie: ");
        int totalMovie = scanner.nextInt(); // например, 77

        for (int i = 1; i <= totalMovie; i++) {
            list.add("Movie # " + i);
        }

        System.out.print("Enter count movie in one page: ");
        int pageSize = scanner.nextInt(); // например, 15

        System.out.print("Enter page: ");
        int pageNum = scanner.nextInt(); // например, 7

        // Пагинация
        int totalPages = (int) Math.ceil((double) totalMovie / pageSize);

        if (pageNum < 1 || pageNum > totalPages) {
            System.out.println("Result: Dannaya stranica ne suwestvuet");
        } else {
            int startIndex = (pageNum - 1) * pageSize;
            int endIndex = Math.min(startIndex + pageSize, list.size());

            List<String> result = list.subList(startIndex, endIndex);

            for (String value : result) {
                System.out.println(value);
            }
        }
    }
}

