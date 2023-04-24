import java.awt.*; 
 class Labelframe extends Frame 
 { 
       Labelframe() 
       { 
          setLayout(new FlowLayout()); 
          Label lblText = new Label("Lable Text"); 
          Label lblTextAlign = new Label("RightAlignment",Label.RIGHT); 
          add(lblText); 
          add(lblTextAlign); 
       } 
 } 
     class LabelJavaAwt  
     {      
          public static void main(String args[]) 
         { 
             Labelframe frame = new Labelframe(); 
             frame.setTitle("Label Component"); 
             frame.setSize(150,150); 
             frame.setVisible(true); 
         } 
     }