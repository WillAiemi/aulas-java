package projhotel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.IOException;

public class Tela {

    public final static void limparTela() {
        /*try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {*/
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            try {
                Thread.sleep(20);
            } catch (InterruptedException exx) {
            }
        } catch (AWTException i) {
        }
        //}
    }
}
