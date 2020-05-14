#include<iostream>
using namespace std;
int main()
{
  int n,p;
  cin>>n;
  
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      p=(i*i)-2;
      cout<<p<<" ";
    }
    else
    {
      p=(i*i)-1;
      cout<<p<<" ";
    }
  }
}
  