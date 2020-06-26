package com.model;

import com.interfaces.IShape;

/**
 *
 * @author Evan Lokajaya
 */
public class GraphicEditor {
    public void DrawShape(IShape shape){
        System.out.println(shape.Drow());
    }
}
