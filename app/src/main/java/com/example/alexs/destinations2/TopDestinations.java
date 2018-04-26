package com.example.alexs.destinations2;

import java.util.ArrayList;

public class TopDestinations {

    private ArrayList<Destination> list;

    public TopDestinations() {
        list = new ArrayList<Destination>();
        list.add(new Destination("Malta"));
        list.add(new Destination("Maldives"));
        list.add(new Destination("Paris"));
        list.add(new Destination("Madrid"));
        list.add(new Destination("Prague"));
        list.add(new Destination("New York"));
        list.add(new Destination("Rio de Janeiro"));
        list.add(new Destination("Sydney"));
        list.add(new Destination("San Francisco"));
        list.add(new Destination("Rome"));
        list.add(new Destination("Tunisia"));
        list.add(new Destination("Cairo"));
        list.add(new Destination("Moscow"));
        list.add(new Destination("Tokyo"));
    }

    public ArrayList<Destination> getList() {
        return new ArrayList<Destination>(list);
    }
}
