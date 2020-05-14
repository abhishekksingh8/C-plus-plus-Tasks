#include<iostream>
using namespace std;
int main()
{ 
  int n,n1,j,i,s=0;
  cin>>n;
  cin>>n1;
  
  for(i=n;i<=n1;i++)
  {
  for(j=1;j<i;j++)
  {
    if(i%j==0)
    {
      s=s+j;
    }
  }
    if(s==i)
      cout<<i<<" ";
    s=0;
  }
}