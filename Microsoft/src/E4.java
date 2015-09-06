import java.lang.String;
public class E4 {
public static void main(String args[]) {
long count=0;
long str4 = 0,str3 = 0;
long result = 0; 
for(int i=999;i>=100;i=i-1){
for(int j=999;j>=100;j=j-1){
long temp = i*j;
String str1 = Long.toString(temp);
String str2 = new StringBuffer(str1).reverse().toString();
if (str1.equals(str2)){
str3 = Long.valueOf(str1);

if (str3>=str4){
result = str3;
str4 = str3;
}}

}}
System.out.println(result);
}}






/*
String str1 = Long.toString(temp);
//System.out.println(str1);

String str2 = new StringBuffer(str1).reverse().toString();
//System.out.println(str2);
if(str1.equals(str2)){
System.out.print(i);
System.out.println(j);
System.out.println(str1);
//break;
}}}}}*/