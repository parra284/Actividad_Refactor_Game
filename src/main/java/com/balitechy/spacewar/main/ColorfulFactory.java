package com.balitechy.spacewar.main;

public class ColorfulFactory implements StyleFactory {

    @Override
    public Player createPlayer(double x, double y, Game game) {
        PlayerRenderer renderer = new ColorfulPlayerRenderer();
        return new Player(x, y, game, renderer);
    }

    @Override
    public Bullet createBullet(double x, double y) {
        BulletRenderer renderer = new ColorfulBulletRenderer();
        return new Bullet(x, y, renderer);
    }

    @Override
    public BackgroundRenderer createBackground() {
        return new ColorfulBackgroundRenderer();
    }
}
