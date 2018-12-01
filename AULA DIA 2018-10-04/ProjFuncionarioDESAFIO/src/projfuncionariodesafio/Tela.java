package projfuncionariodesafio;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Tela {

    public final static void limparTela() {
        try {
            Robot robot = new Robot();
            // Simulate a key press
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
