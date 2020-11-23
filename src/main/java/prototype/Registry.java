package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item)(items.get(type)).clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setRuntime("2 hours");
        movie.setTitle("Basic");
        movie.setPrice(2.99);
        items.put("Movie", movie);
    }

}

