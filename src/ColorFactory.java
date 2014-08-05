/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class ColorFactory implements AbstractFactory {

    @Override
    public Shape getShapeObject(ShapeEnum shapeEnum) {
        return null;
    }

    @Override
    public Color getColorObject(ColorEnum colorEnum) {
        switch(colorEnum) {
            case BLUE:
                return new Blue();
            case RED:
                return new Red();
            case GREEN:
                return new Green();
        }
        return null;
    }    
}
