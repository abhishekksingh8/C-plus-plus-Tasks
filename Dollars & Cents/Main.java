#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,s1=0,s2=0,r;
  cin>>d1>>c1>>d2>>c2;
  
  s1=d1+d2;
  s2=c1+c2;
  
  if(s2>99)
  {
    r=s2/100;
    s2=s2%100;
  }
  s1=s1+r;
  cout<<s1<<endl<<s2;
  
}