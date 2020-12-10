#include <iostream>
using namespace std;

int main() 
{
   string a;
  cin>> a;
  if(a=="break"||a=="case"||a=="continue"||a=="default"||a=="defer"||a=="else"||a=="for"||a=="func"||a=="goto"||a=="if"||a=="map"||a=="range"||a=="return"||a=="struct"||a=="type"||a=="var")
  {
    cout<< a << " is a keyword";
  }
  else
     cout<< a << " is not a keyword";
    return 0;
}