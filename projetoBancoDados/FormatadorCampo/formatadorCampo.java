 
package FormatadorCampo;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

 
public class formatadorCampo {
    
     public void formatarCampoTelefone(JFormattedTextField field) throws ParseException{
        
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("(##) # ####-####");
        mask.install(field);
        
    }
    
    public void formatarCampoCep(JFormattedTextField field) throws ParseException{
        MaskFormatter mask = new MaskFormatter();
        mask.setMask("########");
        mask.install(field);
        
    }
    
    
    
    
    
}
