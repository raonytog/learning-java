package resolucaodosistema;

import java.awt.*;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        System.out.println("A resolucao do sistema eh: " + width + "x" + height);
    }
}
