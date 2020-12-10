#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50];
  cin>>s;
  char s1[50];
  strcpy(s1,s);
  cout<<"The copied string is "<<s1;
}