import java.util.*;
public class ToDoList {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println ("how many task you will add ?");
int Varhow=input.nextInt();
String [] Arrtasks=new String[Varhow];
//int Cou=0;
for (int cou=1;cou<=Varhow;cou++){
    //System.out.println("samih");
    System.out.println ("Enter Your Task " + cou);
    String Taskname=input.next();
    Arrtasks[cou-1]=Taskname;
}

//backtoquestion : 
System.out.println ("do you want to see your data ?");
boolean ans=input.nextBoolean();
if (ans==true){
    System.out.println ("Enter Your Task No");
    int arrindex=input.nextInt();
    System.out.println (Arrtasks[arrindex-1]);
  //  break  backtoquestion;

}
System.out.println ("do you want to remove your data ?");
boolean ans2=input.nextBoolean();
if (ans2==true){
    System.out.println ("Enter Your Task No");
    int arrindex=input.nextInt();
    Arrtasks[arrindex-1]="";
    System.out.println (Arrtasks[arrindex-1]);
  //  break  backtoquestion;

}

//System.out.println(Varhow);

    }
}
