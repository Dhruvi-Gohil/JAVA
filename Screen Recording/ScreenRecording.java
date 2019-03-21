package javaapplication3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenRecording extends Applet implements ActionListener {

    Button startBtn, stopBtn;
    ThreadDemo td;

    @Override
    public void init() {
        startBtn = new Button("Start");
        stopBtn = new Button("Stop");
        startBtn.setBounds(20, 200, 100, 30);
        stopBtn.setBounds(20, 350, 100, 30);
        add(startBtn);
        add(stopBtn);
        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == startBtn) {
            td = new ThreadDemo();
            td.start();
        } else if (ae.getSource() == stopBtn) {
            td.stop();
        }
    }

    class ThreadDemo extends Thread {

        @Override
        public void run() {
            for (int i = 0; ; i++) {
                try {
                    
                    Thread.sleep(1000);
                    Robot r = new Robot();
                    Dimension d = Toolkit
                            .getDefaultToolkit().getScreenSize();
                    BufferedImage img = r.createScreenCapture(new Rectangle(0, 0, (int) d.getWidth(), (int) d.getHeight()));
                    String fileName = "D:\\images\\" + i + ".jpg";
                    System.out.println("File Name: " + fileName);
                    File f = new File(fileName);
                    ImageIO.write(img, "jpg", f);
                } catch (Exception ex) {
                    System.out.println("Exception");
                }
            }
        }

    }
}
