public class Money {
    /*
Napisz program, który:
◦ będzie w pętli losowo pobierał wartość aż "uzbiera" wartość 100
◦ każda pobrana wartość ma być wyświetlona
◦ każda składowa suma ma być wyświetlona
◦ na koniec ma być wyświetlona liczba pobrań pieniędzy koniecznych do uzbierania 100 oraz
uzbierana suma (bo może przekroczyć 100)
◦ spróbuj zmodyfikować ten program, tak by pozwalał uzbierać dokładnie zadaną kwotę (nie
pozwalał na jej przekroczenie)
     */
    int[] money = {1, 2, 5, 10, 20};

    public void displayCalculations(){
        System.out.println("------------------MONEY------------------");
        int goal = 100;
        int counter = 0;
        int i =1;
        while(counter != goal){
            int idx = (int) (Math.random() * money.length + 1);
            System.out.print("Loop " + i + ": " + counter + " + " + money[idx-1] + " = ");
            counter+= money[idx - 1];
            System.out.print(counter + "\n");
            if(counter > 100){
                System.out.print("Loop " + i + ": " + counter + " - " + money[idx-1] + " = ");
                counter -= money[idx - 1];
                System.out.print(counter + "\n");
            }
            i++;
        }
        System.out.println("Final sum: " + counter + " after " + (i-1) + " counting loops.");


    }
}
