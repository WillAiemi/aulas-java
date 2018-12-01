package projassociacao;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Tela {

    public final static void limparTela() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
