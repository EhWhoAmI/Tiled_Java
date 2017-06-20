/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiled.core;

import java.awt.image.BufferedImage;

/**
 * This class, is for the individual tiles in a map or tileset.
 * @author Lam Zyun
 */
public class Tile {
    private BufferedImage tileImage;
    private final int ID;
    private TileSet origin;

    public Tile(BufferedImage tileImage, int ID) {
        this.tileImage = tileImage;
        this.ID = ID;
    }

    public Tile(BufferedImage tileImage, int ID, TileSet origin) {
        this.tileImage = tileImage;
        this.ID = ID;
        this.origin = origin;
    }
    
    public BufferedImage getTileImage () {
        return tileImage;
    }
    
    public int getID () {
        return ID;
    }
    
    public TileSet getOrigin () {
        return origin;
    }
    
    public void setOrigin (TileSet origin) {
        this.origin = origin;
    }
}
