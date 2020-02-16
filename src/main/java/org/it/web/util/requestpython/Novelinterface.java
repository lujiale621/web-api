package org.it.web.util.requestpython;

public interface Novelinterface {
    String NovelSearchBookTask="NovelSearchBookTask";
    String NovelSearchBookMoreTask="NovelSearchBookMoreTask";
    String NovelSearchBookDetailTask="NovelSearchBookDetailTask";
    String NovelSearchBookContentTask="NovelSearchBookContentTask";
    String NovelPoprecommendationTask="NovelPoprecommendationTask";
    String NovelrecommendnovelsTask="NovelrecommendnovelsTask";
    String NovelbookfriendrecommedTask="NovelbookfriendrecommedTask";
    String NovelmostpopularnovelTask="NovelmostpopularnovelTask";
    String NovelgetsortTask="NovelgetsortTask";
    public abstract int getport();
    public abstract void setport(int port);
    abstract   String getbooklist(String msg);
    abstract   String getbookmorelist(String msg);
    abstract  String getbookdetail(String msg);
    abstract  String getbookcontent(String msg);
    abstract String poprecommendation(String msg);
    abstract String recommendgoodnovels(String msg);
    abstract String mostpopularnovel(String msg);
    abstract String bookfriendrecommed(String msg);
    abstract String getsort(String msg);
}
