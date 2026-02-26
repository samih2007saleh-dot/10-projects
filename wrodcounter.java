
import java.util.Scanner;

public class wrodcounter {

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

System.out.println("Write a writing text : ");
String n =myobj.nextLine();

//System.out.println(n.length());
int a = n.replaceAll("\\s","").length();
int count =0;
System.out.println("The number of characters in the writing is : "+ a);
  System.out.println("The number of words in the witing is : "+ n.trim().split("\\s+").length);  
for(int i =0;i<n.length();i++){
if(n.charAt(i)=='A'|| n.charAt(i)== 'a'||n.charAt(i)== 'E'||n.charAt(i)=='e'||n.charAt(i)=='O'||n.charAt(i)=='o'||n.charAt(i)=='U'||n.charAt(i)=='u'||n.charAt(i)=='I'||n.charAt(i)=='i'){

count++;
//System.out.println("The number of vowles character is : "+ count);
}

}
System.out.println("The number of vowles character is : "+ count);
}//end void main
}//end main class
