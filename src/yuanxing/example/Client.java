package yuanxing.example;

import java.util.Random;

/**
 * @program: design
 * @description: 实现类
 * @author: baichen
 * @create: 2018-12-25 10:02
 **/
public class Client {
    //发送账单的数量，从数据库获取
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i = 0;
        //把模板定义出来，从数据库获取
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX版权所有");
        while (i < MAX_COUNT) {
            //以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) +".com");
            sendMail(cloneMail);
            i++;
        }
    }

    //发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    //获取制定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghiklmnopqrstuvwxyzZXCVBNMASDFGHJKLQPWOEIRUTY";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
