package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuList;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
