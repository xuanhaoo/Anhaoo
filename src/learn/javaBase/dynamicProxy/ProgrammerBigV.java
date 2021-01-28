package learn.javaBase.dynamicProxy;

/**
 * @author liangxuanhao
 * @date 2018年05月24日  23:38
 */
public class ProgrammerBigV implements Programmer{

    private Java3y java3y;

    public ProgrammerBigV(Java3y java3y) {
        this.java3y = java3y;
    }

    public void upvote() {
        System.out.println("程序员大V点赞评论收藏转发");
    }

    public void addMoney() {
        System.out.println("点一次赞加价100块！");
    }

    @Override
    public void conding() {
        java3y.conding();
        upvote();
        addMoney();

    }
}
