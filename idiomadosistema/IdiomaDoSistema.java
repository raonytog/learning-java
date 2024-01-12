package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("O idioma do sistema eh: ");
        System.out.print(Locale.getDefault());
        System.out.println();

        System.out.print("E o pais eh: ");
        System.out.print(Locale.getDefault().getCountry());
        System.out.println();
        System.out.println();
    }
}