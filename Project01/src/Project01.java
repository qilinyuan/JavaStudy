/**
 * 家庭收支记账软件
 * 功能：1.显示收支明细 2.登记收入 3.登记支出 4.结束程序
 */

public class Project01 {
    public static void main(String[] args) {
        boolean isFlag=true;
        int balance=10000;
        String details="收支\t账户金额\t收支金额\t收支明细\n";
        do{
            System.out.println("--------------家庭收支记账软件--------------");
            System.out.println("                1.收支明细");
            System.out.println("                2.登记收入");
            System.out.println("                3.登记支出");
            System.out.println("                4.退    出");
            System.out.println("-------------------------------------------");
            char key=Utility.menuSelection();
            switch (key){
                case '1':
                    System.out.println("--------------当前收支详细情况--------------");
                    System.out.println(details);
                    System.out.println("-------------------------------------------");
                    break;
                case '2':
                    System.out.print("请输入收入金额:");
                    int incomeMoney=Utility.readNumber();
                    System.out.print("请输入收入明细:");
                    String incomeInfo=Utility.readString();
                    System.out.println("输入成功！");
                    balance+=incomeMoney;
                    details+="收入\t"+balance+"\t\t"+incomeMoney+"\t\t\t"+incomeInfo+"\n";
                    break;
                case '3':
                    System.out.print("请输入支出金额:");
                    int expenseMoney=Utility.readNumber();
                    System.out.print("请输入支出明细:");
                    String expenseInfo=Utility.readString();
                    System.out.println("输入成功！");
                    balance-=expenseMoney;
                    details+="支出\t"+balance+"\t\t"+expenseMoney+"\t\t\t"+expenseInfo+"\n";
                    break;
                case '4':
                    System.out.println("是否退出？(Y/N):");
                    char selection=Utility.isExitSelection();
                    if(selection=='Y'){
                        isFlag=false;
                    }
                    break;
            }
        }while(isFlag);
    }
}
