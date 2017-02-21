package com.example.burak.myapplication;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class Point {

    private LatLng coordinate;
    private ArrayList<String> name;

    public Point(ArrayList<String> n,LatLng l )
    {
        name=n;
        coordinate=l;
    }

    public LatLng getCoordinate()
    {
        return coordinate;
    }
    public ArrayList<String> getName(){return name;}
    public String toString()
    {
        String result="";
        for(int i=0;i<name.size();i++)
        {
            result=result+name.get(i);

        }
        result=result+coordinate.toString();
        return result;
    }

}
