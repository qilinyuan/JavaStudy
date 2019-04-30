import java.util.Scanner;

public class Utility {
    private static Scanner in = new Scanner(System.in);
    /*判断选择的是否是1,2,3,4*/
    public static char menuSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1);
            c=str.charAt(0);
            if(c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.println("输入错误，请重试！");
            }else{
                break;
            }
        }
        return c;
    }
    /*判断输入的数字是否含有其他字符*/
    public static int readNumber(){
        int number;
        for(;;){
            String str=readKeyBoard(5);
            try{
                number=Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.println("输入错误，请重试！");
            }
        }
        return number;
    }

    /*输入字符串*/
    public static String readString(){
        String str=readKeyBoard(10);
        return str;
    }

    /*接收是否退出命令*/
    public static char isExitSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1).toUpperCase();
            c=str.charAt(0);
            if(c=='Y'||c=='N'){
                break;
            }else{
                System.out.println("输入错误，请重试！");
            }
        }
        return c;
    }

    /*接收键盘输入*/
    private static String readKeyBoard(int length) {
        String line="";
        while(in.hasNext()){
            line=in.next();
            if(line.length()>length||line.length()<0){
                System.out.println("输入错误，请重试！");
            }else{
                break;
            }
        }
        return line;
    }
}

