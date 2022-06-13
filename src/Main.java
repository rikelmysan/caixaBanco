import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner  scan = new Scanner(System.in);
        String nome = scan.nextLine();
        caixa1.logar("111.222.333-11",  "22",  nome);

    }
}
