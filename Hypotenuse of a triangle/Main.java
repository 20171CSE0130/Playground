#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
  float opp,adj;
  cin>> opp>>adj;
  float hyp=sqrt((opp*opp)+(adj*adj));
  printf("%0.2f",hyp);
    return 0;
}