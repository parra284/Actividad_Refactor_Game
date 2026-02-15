package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BitmapBackgroundRenderer implements BackgroundRenderer {

    private BufferedImage background;

    public BitmapBackgroundRenderer() {
        try {
            SpritesImageLoader loader = new SpritesImageLoader("/bg.png");
            loader.loadImage();
            background = loader.getImage(0, 0, 640, 480);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Canvas canvas) {
        if (background != null) {
            g.drawImage(background, 0, 0, canvas.getWidth(), canvas.getHeight(), canvas);
        }
    }
}
