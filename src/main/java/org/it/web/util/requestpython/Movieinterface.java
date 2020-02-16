package org.it.web.util.requestpython;

public interface Movieinterface {
    String MovieSearchTask="MovieSearchTask";
    String MovieDetailTask="MovieDetailTask";
    String MoviePlayerTask="MoviePlayerTask";
    public abstract int getport();
    public abstract void setport(int port);
    abstract   String getMovielist(String msg);
    abstract   String getMovieDetaillist(String msg);
    abstract   String getMoviecontlinklist(String msg);
}
