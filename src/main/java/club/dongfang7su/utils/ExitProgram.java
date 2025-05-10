package club.dongfang7su.utils;

import java.util.Scanner;

/*
*
* 自定义回车退出
*
* */

public class ExitProgram {
    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n请按下回车退出程序\n");
        scanner.nextLine();
        System.exit(0);
    }
}
