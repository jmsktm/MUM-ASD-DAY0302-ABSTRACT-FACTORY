/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class FactoryPatternLab {

    public static void main(String args[]) {
        AbstractFactory s = FactoryProducer.getFactory(FactoryTypeEnum.SHAPE);
        AbstractFactory c = FactoryProducer.getFactory(FactoryTypeEnum.COLOR);
        
        Shape square = s.getShapeObject(ShapeEnum.SQUARE);
        Shape circle = s.getShapeObject(ShapeEnum.CIRCLE);
        Shape line = s.getShapeObject(ShapeEnum.LINE);
        
        Color red = c.getColorObject(ColorEnum.RED);
        Color blue = c.getColorObject(ColorEnum.BLUE);
        Color green = c.getColorObject(ColorEnum.GREEN);
        
        System.out.println(square.toString());
        System.out.println(circle.toString());
        System.out.println(line.toString());
        
        System.out.println(red.toString());
        System.out.println(blue.toString());
        System.out.println(green.toString());
    }
}
