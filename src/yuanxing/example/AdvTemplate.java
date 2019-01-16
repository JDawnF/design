package yuanxing.example;

/**
 * @program: design
 * @description: 广告模板
 * @author: baichen
 * @create: 2018-12-25 09:53
 **/
public class AdvTemplate {
    //广告信名称
    private String advSubject="国庆抽奖啦";
    //内容
    private String advContext="只要抽奖就送100W";

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }
}
