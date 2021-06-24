package com.example.islamic.Presenter;

import com.example.islamic.Model.model;

public class presenter implements model {

      static  int count=0;


    @Override
    public  int add() {

        count++;

        return count;
    }

    @Override
    public int sub() {

        if (count>=1)
        {
            count--;
        }
        else
        {
            count = 0;
        }



        return count;
    }

    @Override
    public int reset() {

        count = 0;


        return count;
    }


}
