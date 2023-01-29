package shop.mtcoding.blog.util;

public class Script {
    // 메시지를 동적으로 받기 위해 back(String msg)\
    // msg는 경고장 메시지 문구

    public static String back(String msg) {
        StringBuffer sb = new StringBuffer();
        // <script></script> 사이에 javaScript를 넣는 것임!!
        sb.append("<script>");
        // alert에 홑따옴표''로 메시지 띄움
        // 홑따옴표 사이에 "++"
        sb.append("alert('" + msg + "');");
        sb.append("history.back();");
        sb.append("</script>");
        // sb를 한꺼번에 붙여서 문자열로 리턴하려면 sb.toString();
        return sb.toString();
    }

    // 경고창 메시지와 이동할 경로 path를 매개변수로 받기
    // 메시지 안 띄우고 싶으면 안 받아도 됨
    public static String href(String msg, String path) {
        StringBuffer sb = new StringBuffer();

        // <script></script> 사이에 javaScript를 넣는 것임!!
        sb.append("<script>");

        // alert에 홑따옴표''로 메시지 띄움
        // 홑따옴표 사이에 "++"
        sb.append("alert('" + msg + "');");

        // location.href = ''; 해당 페이지로 이동
        // 홑따옴표 사이에 "++"
        sb.append("location.href = '" + path + "';");
        sb.append("</script>");

        // sb를 한꺼번에 붙여서 문자열로 리턴하려면 sb.toString();
        return sb.toString();
    }

    public static String href(String path) {
        StringBuffer sb = new StringBuffer();

        // <script></script> 사이에 javaScript를 넣는 것임!!
        sb.append("<script>");

        // location.href = ''; 해당 페이지로 이동
        // 홑따옴표 사이에 "++"
        sb.append("location.href = '" + path + "';");
        sb.append("</script>");

        // sb를 한꺼번에 붙여서 문자열로 리턴하려면 sb.toString();
        return sb.toString();
    }
}
