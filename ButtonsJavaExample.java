import java.awt.*; 
 class ButtonExample extends Frame  
 { 
      ButtonExample() 
      { 
          setLayout(new FlowLayout());       
          Button btnOK = new Button("OK"); 
          add(btnOK); 
      } 
 }  
     class ButtonsJavaExample 
    { 
        public static void main(String args[]) 
       {     
            ButtonExample frame = new ButtonExample(); 
            frame.setTitle("Buttons in Java Example"); 
            frame.setSize(3000,3000); 
            frame.setResizable(false); 
            frame.setVisible(true); 
      }   
    } 