
class ReverseString
{
public static void main(String args[])
{
String a="raja";
char ch;


for(int i=a.length()-1;i>=0;i--){
ch=a.charAt(i);

System.out.print(ch);
}
}
}