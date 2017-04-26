import java.awt.*;        
import java.awt.event.*;  

public class AWTAccumulator extends Frame implements ActionListener, WindowListener {
   private Label lblInput;     
   private Label lblOutput;   
   private TextField tfInput; 
   private TextField tfOutput; 
   private int sum = 0;        
 
   public AWTAccumulator() {
      setLayout(new FlowLayout());  
 
      lblInput = new Label("Nhập số nguyễn: "); 
      add(lblInput);             
 
      tfInput = new TextField(14); 
      add(tfInput);               
 
      tfInput.addActionListener(this);        
 
      lblOutput = new Label("Tổng tích lũy là: ");  
      add(lblOutput);             
 
      tfOutput = new TextField(15); 
      tfOutput.setEditable(false);  
      add(tfOutput);              
 
      addWindowListener(this);
      
      setTitle("AWT Accumulator");  
      setSize(320, 120);  
      setVisible(true);   
   }
 
   public static void main(String[] args) {
      new AWTAccumulator();
   }
 
   @Override
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      
      tfInput.setText("");  
      tfOutput.setText(sum + ""); 
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