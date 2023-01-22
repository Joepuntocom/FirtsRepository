
public class HolaMundo {

    import java.text.SimpleDateFormat;
    import java.util.Calendar;

    import javax.swing.JOptionPane;

    public static void main(String[] args) {
            String nombre, apellido,fecha;
            int edad,año=2023;
            nombre=JOptionPane.showInputDialog("Nombre:");
            apellido=JOptionPane.showInputDialog("Apellido:");
            edad=Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            fecha=JOptionPane.showInputDialog("Dia y Mes de nacimiento:");
            String[]diaMes= fecha.split("/");
            int dia=Integer.parseInt( diaMes[0]);
            int mes=Integer.parseInt( diaMes[1]);
            //HOY
            Calendar calendar =Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String fechaTexto = formatter.format(calendar.getTime());
    
            String[]diaMesA= fechaTexto.split("/");
            int diaA=Integer.parseInt( diaMesA[0]);
            int mesA=Integer.parseInt( diaMesA[1]);
            int añoA=Integer.parseInt( diaMesA[2]);
            boolean cum = false;
            if(mesA > mes || mesA == mes && diaA >= dia ){
                cum = true;
            }
            if(!cum){
                edad = edad + 1;
            }
            año=año-edad;
            
            if(cum){
               JOptionPane.showMessageDialog(null,"Usted: "+nombre+" "+apellido+" \nNacio en "+año+" y ya ha cumplido este año");
            } else {
               JOptionPane.showMessageDialog(null,"Usted: "+nombre+" "+apellido+"\nNacio en "+año+" y no ha cumplido este año");
            }
            
        
        }
}
