class Hillstationreplce{
public static void main (String [] args ){
System.out.println("Main start");
int num=0;
for (int i=0;i<=args.length;i++){

if(num==8){
System.out.println( );
num =0;
}

args[2]="banerghatahill station";
System.out.print(args[i] + "\t");
num++;

}
System.out.println("Main close");
}
}