package org.it.web.util.requestpython;

public class AnimImpl implements Animinterface {
    int PORT=40001;
    int AniminterfaceNumber=0;

    public AnimImpl(int PORT, int animinterfaceNumber) {
        this.PORT = PORT;
        AniminterfaceNumber = animinterfaceNumber;
    }

    @Override
    public String getanimlist(String msg) {
        String commend = AnimSearchTask + "@" + msg+"!"+AniminterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }

    @Override
    public String getanimdetail(String msg) {
        String commend = AnimSearchDetailTask + "@" + msg+"!"+AniminterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }

    @Override
    public String getanimcontentlist(String msg) {
        String commend = AnimSearchContentTask + "@" + msg+"!"+AniminterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }
    @Override
    public int getport() {
        return PORT;
    }
    @Override
    public void setport(int port) {
        this.PORT=port;
    }
}
