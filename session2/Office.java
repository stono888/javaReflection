class Office 
{
	//new 静态加载类，编译的时候就用到了；
	public static void main(String[] args) 
	{
		if("Word".equals(args[0])){
			Word w = new Word();
			w.start();
		}
		if("Excel".equals(args[0])){
			Excel e = new Excel();
			e.start();
		}
	}
}
