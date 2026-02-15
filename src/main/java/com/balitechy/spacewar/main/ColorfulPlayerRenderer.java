package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulPlayerRenderer implements PlayerRenderer {

    private Color borderColor;

    public ColorfulPlayerRenderer() {
        this.borderColor = Color.BLUE; // border color
    }

    @Override
    public void render(Player player, Graphics g) {
        g.setColor(borderColor);
        int x = (int) player.getX();
        int y = (int) player.getY();

        int[] xPoints = { x + Player.WIDTH / 2, x, x + Player.WIDTH };
        int[] yPoints = { y, y + Player.HEIGHT, y + Player.HEIGHT };

        g.drawPolygon(xPoints, yPoints, 3); // outline only
    }
}
