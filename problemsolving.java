package com.oop;

import static java.lang.System.*;

public class problemsolving {
    ////////////////////////////////////instance veriable
    double height,weight,depth ;

        //////////////////////////////////constrctor
        problemsolving(double h , double w, double d){
        this.depth = d;
        this.height = h;
        this.weight = w;


            }
///////////////////////////////////////////////printing or display method
          public void  displayvol(){
        double vol = depth*height*weight;
              out.println("depth = "+depth);
              out.println("height = "+height);
              out.println("weight = "+weight);
              out.println("volume = depth*height*weight : "+vol);


            }
}
