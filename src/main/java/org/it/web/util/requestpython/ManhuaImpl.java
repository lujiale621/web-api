package org.it.web.util.requestpython;

public class ManhuaImpl implements Manhuainterface{
    int PORT=40001;
    int ManhuainterfaceNumber=0;

    public ManhuaImpl(int PORT, int manhuainterfaceNumber) {
        this.PORT = PORT;
        ManhuainterfaceNumber = manhuainterfaceNumber;
    }
    public String task(String msg,String task){
        String commend=task+"@"+msg+"!"+ManhuainterfaceNumber;
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

    @Override
    public String getManhualist(String msg) {
        return task(msg,ManhuaSearchTask);
    }

    @Override
    public String getManhualinklist(String msg) {
        return task(msg,ManhuaSearchlinkTask);
    }

    @Override
    public String getManhuacontlinklist(String msg) {
        return task(msg,ManhuaSearchContentlinkTask);
    }

    @Override
    public String getManhuasortlinklist(String msg) {
        return task(msg,ManhuaSortContentlinkTask);
    }
}
