package Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class TimerPrinter implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("现在的时间是：" + new Date());
        Toolkit.getDefaultToolkit().beep();//获得默认的工具箱。工具箱包含有关GUI环境的信息
    }
}