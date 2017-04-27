import java.awt.*;
import java.awt.event.*;
 
public class MouseEventDemo extends Frame implements MouseListener, WindowListener {
   private TextField tfMouseX; 
   private TextField tfMouseY; 

   public MouseEventDemo() {
      setLayout(new FlowLayout()); 

      add(new Label("X-Click: ")); 

      tfMouseX = new TextField(10); 
      tfMouseX.setEditable(false); 
      add(tfMouseX);               
 
      add(new Label("Y-Click: ")); 
 
      tfMouseY = new TextField(10);
      tfMouseY.setEditable(false);  
      add(tfMouseY);                
 
      addWindowListener(this);
      addMouseListener(this);
        
      setTitle("MouseEvent Demo");
      setSize(350, 100);           
      setVisible(true);           
   }
 
   @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0); 
   }
 
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
   
   public static void main(String[] args) {
      new MouseEventDemo();  
   }
   
   @Override
   public void mouseClicked(MouseEvent evt) {
      tfMouseX.setText(evt.getX() + "");
      tfMouseY.setText(evt.getY() + "");
   }

   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }
}
