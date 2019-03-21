package javaapplication3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaApplication4 extends Applet implements ActionListener {

    Button btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33;
    int isPlayer1 = 1;
    int[][] tic = new int[3][3];
    Label status;
    int count = 0;

    public boolean checkResult() {
        if ((tic[0][0] == 0 && tic[1][0] == 0 && tic[2][0] == 0) || (tic[0][0] == 1 && tic[1][0] == 1 && tic[2][0] == 1)) {
            return true;
        } else if ((tic[0][1] == 0 && tic[1][1] == 0 && tic[2][1] == 0) || (tic[0][1] == 1 && tic[1][1] == 1 && tic[2][1] == 1)) {
            return true;
        } else if ((tic[0][2] == 0 && tic[1][2] == 0 && tic[2][2] == 0) || (tic[0][2] == 1 && tic[1][2] == 1 && tic[2][2] == 1)) {
            return true;
        } else if ((tic[0][0] == 0 && tic[0][1] == 0 && tic[0][2] == 0) || (tic[0][0] == 1 && tic[0][1] == 1 && tic[0][2] == 1)) {
            return true;
        } else if ((tic[1][0] == 0 && tic[1][1] == 0 && tic[1][2] == 0) || (tic[1][0] == 1 && tic[1][1] == 1 && tic[1][2] == 1)) {
            return true;
        } else if ((tic[2][0] == 0 && tic[2][1] == 0 && tic[2][2] == 0) || (tic[2][0] == 1 && tic[2][1] == 1 && tic[2][2] == 1)) {
            return true;
        } else if ((tic[0][0] == 0 && tic[1][1] == 0 && tic[2][2] == 0) || (tic[0][0] == 1 && tic[1][1] == 1 && tic[2][2] == 1)) {
            return true;
        } else if ((tic[0][2] == 0 && tic[1][1] == 0 && tic[2][0] == 0) || (tic[0][2] == 1 && tic[1][1] == 1 && tic[2][0] == 1)) {
            return true;
        }
        return false;
    }

    public void initialise() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tic[i][j] = -1;
            }
        }
    }

    @Override
    public void init() {
        setLayout(null);
        initialise();
        status = new Label("Player 1");
        btn11 = new Button();
        btn12 = new Button();
        btn13 = new Button();
        btn21 = new Button();
        btn22 = new Button();
        btn23 = new Button();
        btn31 = new Button();
        btn32 = new Button();
        btn33 = new Button();
        btn11.setBounds(30, 50, 80, 40);
        btn12.setBounds(130, 50, 80, 40);
        btn13.setBounds(230, 50, 80, 40);
        btn21.setBounds(30, 150, 80, 40);
        btn22.setBounds(130, 150, 80, 40);
        btn23.setBounds(230, 150, 80, 40);
        btn31.setBounds(30, 250, 80, 40);
        btn32.setBounds(130, 250, 80, 40);
        btn33.setBounds(230, 250, 80, 40);
        status.setBounds(100, 340, 500, 20);
        add(status);
        add(btn11);
        add(btn12);
        add(btn13);
        add(btn21);
        add(btn22);
        add(btn23);
        add(btn31);
        add(btn32);
        add(btn33);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        btn31.addActionListener(this);
        btn32.addActionListener(this);
        btn33.addActionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(120, 20, 120, 320);
        g.drawLine(220, 20, 220, 320);
        g.drawLine(20, 120, 320, 120);
        g.drawLine(20, 220, 320, 220);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        count++;
        if (ae.getSource() == btn11) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[0][0] = 0;
                btn11.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[0][0] = 1;
                btn11.setLabel("X");
            }
            btn11.setEnabled(false);
        } else if (ae.getSource() == btn12) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[0][1] = 0;
                btn12.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[0][1] = 1;
                btn12.setLabel("X");
            }
            btn12.setEnabled(false);
        } else if (ae.getSource() == btn13) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[0][2] = 0;
                btn13.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[0][2] = 1;
                btn13.setLabel("X");
            }
            btn13.setEnabled(false);
        } else if (ae.getSource() == btn21) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[1][0] = 0;
                btn21.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[1][0] = 1;
                btn21.setLabel("X");
            }
            btn21.setEnabled(false);
        } else if (ae.getSource() == btn22) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[1][1] = 0;
                btn22.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[1][1] = 1;
                btn22.setLabel("X");
            }
            btn22.setEnabled(false);
        } else if (ae.getSource() == btn23) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[1][2] = 0;
                btn23.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[1][2] = 1;
                btn23.setLabel("X");
            }
            btn23.setEnabled(false);
        } else if (ae.getSource() == btn31) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[2][0] = 0;
                btn31.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[2][0] = 1;
                btn31.setLabel("X");
            }
            btn31.setEnabled(false);
        } else if (ae.getSource() == btn32) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[2][1] = 0;
                btn32.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[2][1] = 1;
                btn32.setLabel("X");
            }
            btn32.setEnabled(false);
        } else if (ae.getSource() == btn33) {
            if (isPlayer1 == 1) {
                isPlayer1 = 0;
                tic[2][2] = 0;
                btn33.setLabel("O");
            } else {
                isPlayer1 = 1;
                tic[2][2] = 1;
                btn33.setLabel("X");
            }
            btn33.setEnabled(false);
        }
        if(isPlayer1 == 1)
        {
            status.setText("Player 1");
        }else
        {
            status.setText("Player 2");
        }
        if (checkResult() == true) {
            btn11.setEnabled(false);
            btn12.setEnabled(false);
            btn13.setEnabled(false);
            btn21.setEnabled(false);
            btn22.setEnabled(false);
            btn23.setEnabled(false);
            btn31.setEnabled(false);
            btn32.setEnabled(false);
            btn33.setEnabled(false);
            if (isPlayer1 == 0) {
                status.setText("Player 1 Wins");
            } else {
                status.setText("Player 2 Wins");
            }
        } else if (count == 9) {
            status.setText("Game Draw");
        }
    }
}
