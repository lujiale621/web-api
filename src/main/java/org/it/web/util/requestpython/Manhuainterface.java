package org.it.web.util.requestpython;

public interface Manhuainterface {

    String ManhuaSearchTask="ManhuaSearchTask";
    String ManhuaSearchlinkTask="ManhuaSearchlinkTask";
    String ManhuaSearchContentlinkTask="ManhuaSearchContentlinkTask";
    String ManhuaSortContentlinkTask="ManhuaSortContentlinkTask";
    public abstract int getport();
    public abstract void setport(int port);
    abstract   String getManhualist(String msg);
    abstract   String getManhualinklist(String msg);
    abstract   String getManhuacontlinklist(String msg);
    abstract   String getManhuasortlinklist(String msg);
}
