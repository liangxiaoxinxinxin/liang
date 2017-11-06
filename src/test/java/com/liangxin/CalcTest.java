package com.liangxin;

import org.testng.Assert;
import org.testng.annotations.Test;

import T71.Calc;

public class CalcTest {
	Calc calc=new Calc();
  @Test
  public void f1() {
	  Assert.assertEquals(calc.add(1, 2), 3);
  }
  @Test
  public void f2(){
	  Assert.assertEquals(calc.minus(3, 2), 1);
  }
  @Test
  public void f3(){
	  Assert.assertEquals(calc.minus(3, 2), -1);
  }  
  @Test
  public void f4(){
	  Assert.assertEquals(calc.add(3, 2), 1);
  }
}
