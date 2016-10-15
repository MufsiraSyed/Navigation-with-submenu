package navdrawer.test.com.navigationdrawertest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> dashboard = new ArrayList<String>();
        List<String> user = new ArrayList<String>();
        List<String> logout = new ArrayList<String>();

        List<String> audit = new ArrayList<String>();
        audit.add("Dashboad");
        audit.add("Calendar");
        audit.add("Plan");
        audit.add("Do");
        audit.add("Check");
        audit.add("Act");
        audit.add("Publish");
        audit.add("Configure");




        List<String> setting = new ArrayList<String>();
        setting.add("Entity");
        setting.add("Master Settings");
        setting.add("Role");
        setting.add("User");
        setting.add("Libraries");
        setting.add("Settings");


        expandableListDetail.put("Dashboad", dashboard);
        expandableListDetail.put("Audit", audit);
        expandableListDetail.put("Settings", setting);
        expandableListDetail.put("User Profile", user);
        expandableListDetail.put("Logout", logout);


        return expandableListDetail;
    }
}
