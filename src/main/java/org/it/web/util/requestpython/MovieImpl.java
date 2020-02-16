package org.it.web.util.requestpython;

public class MovieImpl implements Movieinterface{
    int PORT=40001;
    int MovieinterfaceNumber=0;

    public MovieImpl(int PORT, int movieinterfaceNumber) {
        this.PORT = PORT;
        MovieinterfaceNumber = movieinterfaceNumber;
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
    public String getMovielist(String msg) {
        String commend=MovieSearchTask+"@"+msg+"!"+MovieinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }

    @Override
    public String getMovieDetaillist(String msg) {
        String commend=MovieDetailTask+"@"+msg+"!"+MovieinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }

    @Override
    public String getMoviecontlinklist(String msg) {
        String commend=MoviePlayerTask+"@"+msg+"!"+MovieinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }
}
