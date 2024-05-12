package Timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();
        Timer timer = new Timer(10000,listener);//构造一个定时器，每隔interval(第一个参数)毫秒通告listener(第二个参数)一次
        timer.start();//启动定时器一旦启动成功,定时器将调用监听器的actionPerformed
        JOptionPane.showMessageDialog(null,"是否停止项目？"); //显示一个包含一条消息和 OK 按钮的对话框。这个对话框将位于其parent组件的中央。如果parent为mill,对话框将显示在屏幕的中央
        System.exit(0);
    }
}


