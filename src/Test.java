// // // // // // // // // // // // // // // // // // // // // // // // // // //
// Copyright ownership belongs to SINOSOFT CO.,LTD.shall not be reproduced ,  //
// copied,or used in other ways without permission.Otherwise SINOSOFT CO.,LTD.//
// will have the right to pursue legal responsibilities.                      //
//                                                                            //
// Copyright &copy; 2012 SINOSOFT CO., LTD. All rights reserved.              //
// // // // // // // // // // // // // // // // // // // // // // // // // // //

/**
 * User: Administrator
 * Date: 2014/8/21
 * Time: 11:02
 */
import java.util.Date;
public  class Test extends Date{
	public static void main(String[] args) {
		new Test().test();
	}

	public void test(){
		System.out.println(super.getClass().getCanonicalName());
        System.out.println("test 2");
    }
}


