#include<iostream>
using namespace std;
int main()
{
 int uc;
 float eb;
  cin>>uc;
  
  if(uc<=200)
    eb=0.5*uc;
  else if(uc>200&&uc<=400)
    eb=0.65*uc+100;
  else if(uc>400&&uc<=600)
    eb=0.80*uc+200;
  else
    eb=1.25*uc+425;
 cout<<"Rs."<<(int)eb;
}