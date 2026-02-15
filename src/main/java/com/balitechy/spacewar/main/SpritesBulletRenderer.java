package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritesBulletRenderer implements BulletRenderer {

    private BufferedImage image;

    public SpritesBulletRenderer(BufferedImage image) {
        this.image = image;
    }

    @Override
    public void render(Bullet bullet, Graphics g) {
        g.drawImage(image, (int)bullet.getX(), (int)bullet.getY(), null);
    }
}
