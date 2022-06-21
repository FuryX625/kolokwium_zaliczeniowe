import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner wpis=new Scanner(System.in);
    int liczba;
    int wynik=1;
    do{
      System.out.print("Podaj liczbę całkowitą: ");
      liczba=wpis.nextInt();
      if (liczba%2==0)
        wynik=wynik*liczba;
    }while(liczba!=-5);
    System.out.println("Wynik mnożenia to:"+wynik);
    wpis.close();  
    System.exit(0);
  }
    
}
