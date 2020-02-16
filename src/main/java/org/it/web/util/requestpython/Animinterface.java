package org.it.web.util.requestpython;

public interface Animinterface {
    String AnimSearchTask="AnimSearchTask";
    String AnimSearchDetailTask="AnimSearchDetailTask";
    String AnimSearchContentTask="AnimSearchContentTask";
    public abstract int getport();
    public abstract void setport(int port);
    abstract   String getanimlist(String msg);
    abstract   String getanimdetail(String msg);
    abstract   String getanimcontentlist(String msg);
}
