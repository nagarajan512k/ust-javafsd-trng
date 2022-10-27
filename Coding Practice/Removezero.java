
class Removezero
{
public static void main(String args[])
{
String a="0000002468";
char ch;
int ind=0;
String b="";

for(int i=0;i<a.length();i++){
ch=a.charAt(i);
if(ch!='0')
{
	ind=i;
	break;

}

}
b=a.substring(ind,a.length());
System.out.println(b);


}
}