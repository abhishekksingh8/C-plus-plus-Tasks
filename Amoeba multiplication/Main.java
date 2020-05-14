#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  int f=0,s=1,t=0;
  for(int i=2;i<=n;i++)
  {
    t=f+s;
    f=s;
    s=t;
  }
  cout<<f;
}