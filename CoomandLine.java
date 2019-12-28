package project1;

public class CoomandLine {

	public static void main(String[] args) {
          int code=Integer.parseInt(args[0]);
          String name=args[1];
          double sa1=Double.parseDouble(args[2]);
          System.out.println(code++);
          System.out.println(name);
          System.out.println(sa1);
          
	}

}
