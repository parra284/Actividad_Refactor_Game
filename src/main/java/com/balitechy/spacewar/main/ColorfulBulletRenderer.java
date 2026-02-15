package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulBulletRenderer implements BulletRenderer {

    private Color color;

    public ColorfulBulletRenderer() {
        this.color = Color.RED; // bullets in black
    }

    @Override
    public void render(Bullet bullet, Graphics g) {
        g.setColor(color);
        int x = (int) bullet.getX() + Bullet.WIDTH / 2;
        g.drawLine(x, (int) bullet.getY(), x, (int) bullet.getY() + Bullet.HEIGHT);
    }
}
