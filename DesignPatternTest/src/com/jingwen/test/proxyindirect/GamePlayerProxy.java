package com.jingwen.test.proxyindirect;

public class GamePlayerProxy implements IGamePlayer , IProxy {
    private IGamePlayer gamePlayer = null;
    //
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }
    //
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
    // 
    public IGamePlayer getProxy() {
        return this;
    }
    
    public void count() {
        System.out.print("升级总费用是：150元");
    }
}
