/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiled.core;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * This class is for the tilesets.
 * @author Lam Zyun
 */
class TileSet {
    public ArrayList<Tile> tiles;
    private String originPath;
    private Dimension tileSize;

    public TileSet(ArrayList<Tile> tiles, String originPath, Dimension tileSize) {
        this.tiles = tiles;
        this.originPath = originPath;
        this.tileSize = tileSize;
    }
    
    public TileSet(TileSet tileSet) {
        this(tileSet.tiles, tileSet.originPath, tileSet.getTileSize());
    }
    public void addTile (Tile tile) {
        tile.setOrigin(this);
        tiles.add(tile);
    }
    
    public void addTile (BufferedImage image, int ID) {
        Tile toAdd = new Tile(image, ID, this);
        addTile(toAdd);
    }

    public Dimension getTileSize() {
        return tileSize;
    }

    public String getOriginPath() {
        return originPath;
    }
    
    public int getTileNumber () {
        return tiles.size();
    }
    
    public static class TilesetG extends TileSet{
        int startgid;
        public TilesetG(ArrayList<Tile> tiles, String originPath, Dimension tileSize, int gid) {
            super(tiles, originPath, tileSize);
            this.startgid = gid;
        }
        
        public TilesetG(TileSet tileSet, int gid) {
            super(tileSet);
            this.startgid = gid;
        }
        
        public Tile getTile (int gid) {
            return tiles.get(gid - startgid);
        }
        
        public int getStartGid() {
            return startgid;
        }
        
        public TileSet toTileset() {
            return (TileSet) this;
        }
    }
}
