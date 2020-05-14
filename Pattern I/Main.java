#include<iostream>
using namespace std;
int main()
{
  int n,i,j,c=1;
  cin>>n;
  
  for(int i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    n++;
    cout<<"\n";
  }
    n--;
  for(int i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    n--;
    cout<<"\n";
  }
} 
    