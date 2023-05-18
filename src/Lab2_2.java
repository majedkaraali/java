import javax.swing.JOptionPane;

public class Lab2_2 {
    public static void main(String[] args) {
        int yil = Integer.parseInt(JOptionPane.showInputDialog("Dogum yilini girin:"));
        int ay = Integer.parseInt(JOptionPane.showInputDialog("Dogum ayini girin:"));
        int gun = Integer.parseInt(JOptionPane.showInputDialog("Dogum gununu girin:"));

        int bugun =12;
        int buay=5;
        int buyil=2023;
        

        JOptionPane.showMessageDialog(null, "Yaınız: " + (buyil-yil) + " yil " + (buay-ay) + " ay " + (bugun-gun) + " gun");
        
       
        if (ay==buay) {
        	if(gun==bugun){
        		JOptionPane.showMessageDialog(null, "İyi ki doğdun :D",null, JOptionPane.WARNING_MESSAGE);
        	}
        }
         
       
    }
}
