package section13;

import section13.access1.MyUtil;

public class InnerClass03 {
	public static void main(String[] args) {
		//MyUtil 클래스 안에 HelloPrinter 내부 클래스 생성하기
		
		//첫번째 방법
		MyUtil mu = new MyUtil();//MyUtil 객체 생성
		MyUtil.HelloPrinter hp = mu.new HelloPrinter(); //HelloPrinter 객체 생성
		hp.printHello();
		
		//두번째 방법
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		hp2.printHello();
	}
}
