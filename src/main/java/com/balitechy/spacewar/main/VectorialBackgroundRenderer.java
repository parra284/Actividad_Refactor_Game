package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class VectorialBackgroundRenderer implements BackgroundRenderer {

    @Override
    public void render(Graphics g, Canvas canvas) {
        // Fill background with white
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        // Draw circle outline at top-left
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 150, 150); // outline only
    }
}
