package com.balitechy.spacewar.main;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritesFactory implements StyleFactory {

    private SpritesImageLoader loader;

    public SpritesFactory() {
        loader = new SpritesImageLoader("/sprites.png");
        try {
            loader.loadImage();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Player createPlayer(double x, double y, Game game) {
        BufferedImage sprite = loader.getImage(219, 304, Player.WIDTH, Player.HEIGHT);
        PlayerRenderer renderer = new SpritesPlayerRenderer(sprite);
        return new Player(x, y, game, renderer); 
    }

    @Override
    public Bullet createBullet(double x, double y) {
        BufferedImage bulletSprite = loader.getImage(35, 52, Bullet.WIDTH, Bullet.HEIGHT);
        BulletRenderer bulletRenderer = new SpritesBulletRenderer(bulletSprite);
        return new Bullet(x, y, bulletRenderer);
    }

    @Override
    public BackgroundRenderer createBackground() {
        return new BitmapBackgroundRenderer();
    }

}

