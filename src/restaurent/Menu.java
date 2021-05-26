package restaurent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
      private List<MenuItem> list = new ArrayList<MenuItem>();
    public void addMenu(MenuItem menuItem){
        list.add(menuItem);
        System.out.println("Added Menuitem");
    }

    public void remove(String description){
        System.out.println("Removed selected item:");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDescription().equals(description)){
                list.remove(i);
                break;
            }
        }
    }
    public String isNew(String description){
        System.out.println("Cheching isnew");
        String isNew = "NO";
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDescription().equals(description)){
                if(list.get(i).getIsnew()){
                   isNew = "YES";
                   break;
                }else{
                    isNew = "NO";
                    break;
                }
            }
        }
        return isNew;
    }

    public Date lastUpdatedDate(String description){
        System.out.println("Last updateditem");
        Date date = null;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDescription().equals(description)) {
                date = list.get(i).getLastupdated();
            }
        }
        return date;
    }

    public void displayMenu(String description){
        System.out.println("Listed menuitems:");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getDescription().equals(description)){
                System.out.println("Isnew:" + list.get(i).getIsnew());
                System.out.println("Lastupdated:" + list.get(i).getLastupdated());
                System.out.println("Price:" + list.get(i).getPrice());
                System.out.println("Description:" + list.get(i).getDescription());
                System.out.println("Category:" + list.get(i).getCategory());
                break;
            }
        }
    }

    public void displayMenuItems(){
        System.out.println("Menuitems are:");
        for(MenuItem menuItem: list){
            System.out.println("Isnew:" + menuItem.getIsnew());
            System.out.println("Lastupdated:" + menuItem.getLastupdated());
            System.out.println("Price:" + menuItem.getPrice());
            System.out.println("Description:" + menuItem.getDescription());
            System.out.println("Category:" + menuItem.getCategory());
        }
    }

}