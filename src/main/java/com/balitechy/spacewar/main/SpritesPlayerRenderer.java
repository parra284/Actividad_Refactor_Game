package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritesPlayerRenderer implements PlayerRenderer{

    private BufferedImage sprite;

    public SpritesPlayerRenderer(BufferedImage sprite) {
        this.sprite = sprite;
    }
    
    @Override
    public void render(Player player, Graphics g) {
        g.drawImage(sprite, (int) player.getX(), (int) player.getY(), null);
    }
}
