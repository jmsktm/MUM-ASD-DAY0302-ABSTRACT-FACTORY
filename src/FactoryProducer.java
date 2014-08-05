/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsingh
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryTypeEnum choice) {
        switch (choice) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
        }
        return null;
    }
}
