#include<iostream>
using namespace std;
int main()
{
  int n,p=6;
  cin>>n;
  
  cout<<p<<" ";
  for(int i=1;i<n;i++)
  {
    p=p+(5*i);
    cout<<p<<" ";
  }
}
  