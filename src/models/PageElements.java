package models;

import java.util.ArrayList;
import java.util.List;

public class PageElements{
    List<PageElements> elements = new ArrayList<PageElements>();

    public void attach(PageElements newElement){
        this.PageElements.add(newElement);
    }

    public void setElements(List<PageElements> elements) {
        this.elements = elements;
    }

    public List<PageElements> getElements() {
        return elements;
    }

    public void dettach(PageElements){
        this.page.remove(Element);
    }


}