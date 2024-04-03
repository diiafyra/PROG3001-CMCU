/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai35;

/**
 *
 * @author DELL
 */
interface Drawable{
    public void draw();
}

interface Resizable{
    public void resize();
}

class Shape implements  Drawable , Resizable{
    @Override
    public void draw(){
        
    }
    
    @Override
    public void resize(){
        
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(){

    }
    
    @Override
    public void resize(){
        
    }    
}

class Circle extends Shape{
    @Override
    public void draw(){
        
    }
    
    @Override
    public void resize(){
        
    }    
}

public class bai35 {
    
}
