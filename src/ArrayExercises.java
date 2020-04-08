import java.util.Arrays;

/*
Przy użyciu jednej z pętli, napisz fragment kodu, który wypisze:
 */
public class ArrayExercises {
    private int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

    public void displayArray(){
        // ◦ wszystkie cyfry
        System.out.println("wszystkie cyfry");
        for(int i : integers){
            System.out.print(Integer.toString(i) + " ");
        }

        // ◦ 6 pierwszych cyfr
        System.out.println("\n6 pierwszych cyfr");
        for(int i=0; i <integers.length; i++){
            if(i > 5){
                continue;
            }
            System.out.print(Integer.toString(integers[i]) + " ");
        }

        //◦ 6 ostatnich cyfr
        System.out.println("\n6 ostatnich cyfr");
        for(int i=0; i <integers.length; i++){
            if(i <= 3){
                continue;
            }
            System.out.print(Integer.toString(integers[i]) + " ");
        }

        //◦ wszystkie parzyste cyfry
        System.out.println("\nwszystkie parzyste cyfry");
        for(int i : integers){
            if(i%2 == 0){
                System.out.print(Integer.toString(i) + " ");
            }
        }

        //◦ wszystkie cyfry na nieparzystych indeksach
        System.out.println("\nwszystkie cyfry na nieparzystych indeksach");
        for(int i=0; i <integers.length; i++){
            if(i%2 !=0){
                System.out.print(Integer.toString(integers[i]) + " ");
            }
        }

        //◦ wszystkie cyfry od tyłu
        System.out.println("\nwszystkie cyfry na nieparzystych indeksach");
        for(int i=integers.length-1; i >=0; i--){
                System.out.print(Integer.toString(integers[i]) + " ");
        }

        //◦ wszystkie cyfry oprócz cyfry 5
        System.out.println("\nwszystkie cyfry oprócz cyfry 5");
        for(int i : integers){
            if(i == 5){
                continue;
            }
            System.out.print(Integer.toString(i) + " ");
        }

        //◦ wszystkie cyfry do cyfry 7 włącznie
        System.out.println("\nwszystkie cyfry do cyfry 7 włącznie");
        for(int i : integers){
            if(i == 7){
                System.out.print(Integer.toString(i) + " ");
                break;
            }
            System.out.print(Integer.toString(i) + " ");
        }

        //◦ wszystkie cyfry podzielne przez 3
        System.out.println("\nwszystkie cyfry podzielne przez 3");
        for(int i : integers) {
            if (i % 3 == 0) {
                System.out.print(Integer.toString(i) + " ");
            }
        }

        //◦ sumę wszystkich cyfr
        System.out.println("\nsumę wszystkich cyfr");
        int sum = 0;
        for(int i : integers) {
           sum+=i;
        }
        System.out.println(sum);

        //◦ sumę cyfr większych lub równych 4
        System.out.println("sumę cyfr większych lub równych 4");
        int sum2 = 0;
        for(int i : integers){
            if(i >= 4){
                sum2+=i;
            }
        }
        System.out.println(sum2);

        //◦ najmniejszą i największą cyfrę
        System.out.println("najmniejszą i największą cyfrę");
        Arrays.sort(integers);
        System.out.println("Sort: " + Arrays.toString(integers));
        System.out.println("Minimum: " + integers[0]);
        System.out.println("Maximum: " + integers[integers.length-1]);

    }
}
