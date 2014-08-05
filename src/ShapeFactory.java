/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShapeObject(ShapeEnum shapeEnum) {
        switch (shapeEnum) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case LINE:
                return new Line();
        }
        return null;
    }

    @Override
    public Color getColorObject(ColorEnum colorEnum) {
        return null;
    }
}
