package models;

import java.util.ArrayList;
import java.util.List;

public class Page{
    List<Page> page = new ArrayList<Page>();

    public void attach(Page newPage){
        this.page.add(newPage);
    }

    public void setPage(){

    }

    public List<Page> getPage() {
        return page;
    }

    public void dettach(Page){
        this.page.remove(page);
    }


}