package com.company.decorator;

public class PanPizza extends Pizza {

    PanPizza(){
        this.description="pan pizza";
    }



    @Override
    public double getCost(){
        return 1000;
    }





}
