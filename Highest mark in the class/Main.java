#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
}
  int high=a[0];
  
  for(int i=0;i<n;i++)
  {
    if (high<=a[i])
      high=a[i];

  }
  
  cout<<high;
    
}