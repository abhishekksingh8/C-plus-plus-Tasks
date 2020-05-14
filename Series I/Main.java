#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  
  float p=0.5;
  cout<<p<<" ";
  
  for(int i=2;i<=n;i++)
  {
    p=p*3.0;
    cout<<p<<" ";
  }
}
  