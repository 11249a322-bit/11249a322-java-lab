Aim:
 To write and execute a Java program using the CardLayout manager to display different buttons one at a time in an Applet.

Algorithm:
1.Start the program.
2.Import the required packages: java.io, java.awt, java.applet, and java.awt.event.
3.Create a class named carddemo that extends Applet and implements ActionListener.
4.Declare three Button objects, a Panel, and a CardLayout object.
5.Define the init() method.
6.Create a Panel and add it to the Applet
7.Create a CardLayout object and set it as the layout manager of the Panel.C.reate three buttons: First Button, Second Button, and Third Button.
8.Register an ActionListener for each button.
9.Add all three buttons to the Panel using CardLayout with different names.
10.Define the actionPerformed() method
11.Use buttonCardLayout.next(buttonPanel) to display the next button whenever the current button is clicked.
12.Stop the program.

PROGRAM:
import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="carddemo" width=250 height=150>
</applet>
*/

public class carddemo extends Applet implements ActionListener
{
    Button b1,b2,b3,b4;
    Panel buttonPanel;
    CardLayout buttonCardLayout;

    public void init()
    {
        buttonPanel = new Panel();
        add(buttonPanel);

        buttonCardLayout = new CardLayout();
        buttonPanel.setLayout(buttonCardLayout);

        b1 = new Button("first Button");
        b1.addActionListener(this);
        buttonPanel.add(b1,"first Button");

        b2 = new Button("second Button");
        b2.addActionListener(this);
        buttonPanel.add(b2,"second Button");

        b3 = new Button("third button");
        b3.addActionListener(this);
        buttonPanel.add(b3,"third Button");
    }

    public void actionPerformed(ActionEvent e)
    {
        buttonCardLayout.next(buttonPanel);
    }
}




Result:

Thus, the Java Applet program using the CardLayout manager was written and executed successfully. It displays three buttons one at a time, and clicking a button displays the next button.


