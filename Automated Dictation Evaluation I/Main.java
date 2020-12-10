#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50],str2[50];
  cin>>str1;
  cin>>str2;
  int s=strcmp(str1,str2);
  if(s!=0)
  {
    cout<<"It is wrong";
  }
  else
    cout<<"It is correct";
  
}