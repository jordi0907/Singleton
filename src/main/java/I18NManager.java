import javax.annotation.Resource;
import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {


    private static I18NManager manager;
    HashMap<String, ResourceBundle> data;
    ResourceBundle seleccion;

    private I18NManager() {
           /*this.data = new HashMap<String, ResourceBundle>();
           ResourceBundle ca = ResourceBundle.getBundle("ca");
           ResourceBundle es =  ResourceBundle.getBundle("es");
           ResourceBundle en =  ResourceBundle.getBundle("en");
           this.data.put("ca", es);
           this.data.put("es", es);
           this.data.put("en", en);*/

    }

    public static I18NManager getInstance(){
        if(manager==null) manager = new I18NManager();
        return manager;
    }

    public String getText(String language, String key){
        String result = null;
        this.seleccion = ResourceBundle.getBundle(language);
        result = seleccion.getString(key);

        //result = this.data.get(language).getString(key);
        return result;
    }

    public static void main(String[] args){

        String msg0 = I18NManager.getInstance().getText("ca","l1");
        String msg1 = I18NManager.getInstance().getText("es","l1");
        String msg2 = I18NManager.getInstance().getText("en","l1");
        String msg3 = I18NManager.getInstance().getText("frances","l2");


        System.out.println("msg1 " +msg1);
        System.out.println("msg3 " +msg3);



    }
}
