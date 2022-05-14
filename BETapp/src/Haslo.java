import java.util.HashMap;

public class Haslo {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    Haslo(){

        logininfo.put("haslo", "abc321");



    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }


}
