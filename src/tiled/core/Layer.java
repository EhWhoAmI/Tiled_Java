/*
 * The MIT License
 *
 * Copyright 2017 Zyun.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package tiled.core;

/**
 *
 * @author Zyun
 */
public class Layer {
    int [][] tiles;
    
    TileSet thisTileSet;
    /**
     * 
     * @param tiles
     * @param tileSet The first tileset to add. It is necessary for the first one, or else it will return a NullPointer for the tile.
     */
    public Layer(int[][] tiles, TileSet tileSet) {
        this.tiles = tiles;
        thisTileSet = tileSet;
    }
    
    public void addTileSet (TileSet tileSet) {
        thisTileSet.append(tileSet);
    }
    
    public Tile getTileAt (int x, int y) {
        //Get the tile id that is in the x y pos.
        int ID = tiles [x][y];
        
    }
}
