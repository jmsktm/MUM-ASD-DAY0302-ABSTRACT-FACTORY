/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class MainApp {

    public static void main(String args[]) {
        AbstractFactory s = FactoryProducer.getFactory(FactoryTypeEnum.SHAPE);
        AbstractFactory c = FactoryProducer.getFactory(FactoryTypeEnum.COLOR);
        
        Shape square = s.getShapeObject(ShapeEnum.SQUARE);
        Shape circle = s.getShapeObject(ShapeEnum.CIRCLE);
        Shape line = s.getShapeObject(ShapeEnum.LINE);
        
        Color red = c.getColorObject(ColorEnum.RED);
        Color blue = c.getColorObject(ColorEnum.BLUE);
        Color green = c.getColorObject(ColorEnum.GREEN);
        
        square.draw();
        circle.draw();
        line.draw();
        
        red.color();
        blue.color();
        green.color();
    }
}
