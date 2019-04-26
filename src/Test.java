
class Test {
	public Test(){ //构造方法
	}
	protected void doSomething(){//成员方法
	}
	protected Test dolt(){
		return new Test();
	}
}
class Test2 extends Test{
	public Test2(){
		super();  //调用父类构造方法
		super.doSomething();  //调用父类成员方法
	}
	public void doSomethingnew(){
		
	}
	public void doSomething(){   //重写父类方法
		
	}
	public Test2 dolt(){   //重写父类方法，返回值类型为Test2
		return new Test2();
	}
}