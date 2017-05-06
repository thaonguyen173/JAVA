import java.awt.*;
import java.awt.event.*;

public class AWTCounter3Buttons extends Frame implements WindowListener {
   private TextField tfCount;
   private Button btnCountUp, btnCountDown, btnReset;
   private int count = 0;
 
   public AWTCounter3Buttons () {
      setLayout(new FlowLayout());
      add(new Label("Counter"));  
      tfCount = new TextField("0", 10);
      tfCount.setEditable(false);  
      add(tfCount);             
 
      btnCountUp = new Button("Count Up");
      add(btnCountUp);
      
      btnCountUp.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
         }
      });
 
      btnCountDown = new Button("Count Down");
      add(btnCountDown);
      btnCountDown.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count--;
            tfCount.setText(count + "");
         }
      });
 
      btnReset = new Button("Reset");
      add(btnReset);
      btnReset.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
            count = 0;
            tfCount.setText("0");
         }
      });
      
      addWindowListener(this);
      
      setTitle("AWT Counter");
      setSize(400, 100);
      setVisible(true);
   }
 
   public static void main(String[] args) {
      new AWTCounter3Buttons(); 
   }
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  
   } 
   @Override public void windowOpened(WindowEvent evt){ }
   @Override public void windowClosed(WindowEvent evt){ }
   @Override public void windowIconified(WindowEvent evt){ }
   @Override public void windowDeiconified(WindowEvent evt){ }
   @Override public void windowActivated(WindowEvent evt){ }
   @Override public void windowDeactivated(WindowEvent evt){ }
   }