package DesignPatterns.Challanges.ch1;

import java.util.*;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCustomIterator implements ArrayIterator {

    private List<Integer> list;
    private int position=0;

    public ArrayCustomIterator( List<Integer> list )
    {
        this.list = list;
    }

    public ArrayCustomIterator(int[] arr)
    {
        this.list =  new ArrayList<Integer>();
        for (var n : arr){
            this.list.add(n);
        }
    }

    @Override public int next()
    {
        return this.list.get(position++);

    }

    @Override public boolean hasNext()
    {
        return (position < list.size());
    }
}
