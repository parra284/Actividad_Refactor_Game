package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorialBulletRenderer implements BulletRenderer {

    private Color color;

    public VectorialBulletRenderer() {
        this.color = Color.BLACK; // bullets in black
    }

    @Override
    public void render(Bullet bullet, Graphics g) {
        g.setColor(color);
        int x = (int) bullet.getX() + Bullet.WIDTH / 2;
        g.drawLine(x, (int) bullet.getY(), x, (int) bullet.getY() + Bullet.HEIGHT);
    }
}
