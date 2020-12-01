/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bandeiradeisrael;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

/**
 *
 * @author ed
 */
public class EstrelaDavi {
    int angle = 0;
    GeneralPath pen = new GeneralPath();
    AffineTransform at;
    
    public void printEstrela(Graphics2D g)
    {
       at = new AffineTransform();
       
       at.rotate(Math.toRadians(this.getAngle()), 250, 250);
       
       g.setColor(Color.BLUE);
       /*
       pen.moveTo(200, 200);
       pen.lineTo(300, 200);
       pen.lineTo(250, 300);
       pen.lineTo(200, 200);
       pen.lineTo(225, 200);
       pen.lineTo(250, 175);
       pen.lineTo(275, 200);
       pen.lineTo(300, 275);
       pen.lineTo(200, 275);
       pen.lineTo(225, 200);
       */
       
       pen.moveTo(200, 200);
       pen.lineTo(300, 200);
       pen.lineTo(250, 300);
       pen.lineTo(200, 200);
       pen.lineTo(235, 200);
       pen.lineTo(250, 175);
       pen.lineTo(265, 200);
       pen.lineTo(300, 275);
       pen.lineTo(200, 275);
       pen.lineTo(235, 200);
       g.setTransform(at);
       g.draw(pen);
       
    }
    
    public void setAngle(int encreaseFactor) {
        this.angle += encreaseFactor;
    }
    
    public int getAngle() {
        return this.angle;
    }
}
