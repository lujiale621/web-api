package org.it.web.util.requestpython;

public class NovelImpl implements Novelinterface {
    int PORT=40001;
    int NovelinterfaceNumber=0;
    public String task(String msg,String task){
        String commend=task+"@"+msg+"!"+NovelinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }
    public NovelImpl(int PORT, int novelinterfaceNumber) {
        this.PORT = PORT;
        NovelinterfaceNumber = novelinterfaceNumber;
    }

    @Override
    public String getbooklist(String msg) {
        return task(msg,NovelSearchBookTask);
    }

    @Override
    public String getbookmorelist(String msg) {
        return task(msg,NovelSearchBookMoreTask);
    }

    @Override
    public String getbookdetail(String msg) {
        String commend = NovelSearchBookDetailTask + "@" + msg+"!"+NovelinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return task(msg,NovelSearchBookDetailTask);
    }

    @Override
    public String getbookcontent(String msg) {
        return task(msg,NovelSearchBookContentTask);
    }

    @Override
    public String poprecommendation(String msg) {
        return task(msg,NovelPoprecommendationTask);
    }

    @Override
    public String recommendgoodnovels(String msg) {
        return task(msg,NovelrecommendnovelsTask);
    }

    @Override
    public String mostpopularnovel(String msg) {
        return task(msg,NovelmostpopularnovelTask);
    }

    @Override
    public String bookfriendrecommed(String msg) {
        return task(msg,NovelbookfriendrecommedTask);
    }
    @Override
    public String getsort(String msg) {
        return task(msg,NovelgetsortTask);
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
