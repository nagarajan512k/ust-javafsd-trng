
class Removezero
{
public static void main(String args[])
{
String a="0000002468";
char ch;
int ind=0;
String b="";

for(int i=0;i<a.length();i++){
ch=s.charAt(i);
if(ch!='0')
{
	ind=i;
	break;

}
b=ch.substring(ind,a);
System.out.println(b);

}


}
}