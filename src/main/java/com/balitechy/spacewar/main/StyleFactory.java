package com.balitechy.spacewar.main;

public interface StyleFactory {
    Player createPlayer(double x, double y, Game game);
    Bullet createBullet(double x, double y);
    BackgroundRenderer createBackground();
}
