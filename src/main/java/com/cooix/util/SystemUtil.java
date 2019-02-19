package com.cooix.util;

import java.util.Scanner;

/**
 * @author zhang
 * @version 1.0
 * @classname SystemUtil
 * @descriptionclass 1.****************
 * 2.****************
 * @createdate 2019/2/19
 * @since 1.0
 */
public class SystemUtil {


	public static void main(String[] args) {

		String info = "本jar包是用来获取系统信息的jar包";

		String numInfo = "请输入您要查看的信息:\n" +
				"**********************************************\n" +
				"    1.系统基本信息          2.CPU信息\n" +
				"    3.内存基本信息          4.操作系统基本信息\n" +
				"    5.用户基本信息          6.文件系统基本信息\n" +
				"    7.网络基本信息          8.以太网基本信息\n" +
				"    9.全部基本信息          10.退出系统\n" +
				"**********************************************";
		System.out.println(info);

		String argeInfo = "请输入合法的参数;";


		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println(numInfo);
			String s = scanner.nextLine();
			//System.out.println(s);
			boolean flag = false;
			try{
				int ss = Integer.valueOf(s);
				switch (ss){
					case 1:
						RuntimeTest.property();
						break;
					case 2:
						RuntimeTest.cpu();
						break;
					case 3:
						RuntimeTest.memory();
						break;
					case 4:
						RuntimeTest.os();
						break;
					case 5:
						RuntimeTest.who();
						break;
					case 6:
						RuntimeTest.file();
						break;
					case 7:
						RuntimeTest.net();
						break;
					case 8:
						RuntimeTest.ethernet();
						break;
					case 9:
						RuntimeTest.allInfo();
						break;
					case 10:
						flag =true;
						break;
					default:
						System.out.println(argeInfo);
				}
				if(flag){
					break;
				}
			}catch (Exception e ){
				System.out.println(argeInfo);
			}
		}
		System.out.println("期待您的再次使用！");


	}


}
