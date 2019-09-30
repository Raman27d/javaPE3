import java.util.Scanner;

class Places{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPlaces = scanner.nextInt();
        String[] places = new String[numOfPlaces];
        scanner.nextLine();
        for(int i=0; i<numOfPlaces; i++){
            places[i] = scanner.nextLine();
        }
        for(int i=0; i<numOfPlaces; i++){
            System.out.println(places[i]);
        }

    }
}