/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public interface AbstractFactory {
    public Shape getShapeObject(ShapeEnum shapeEnum);
    public Color getColorObject(ColorEnum colorEnum);
}
