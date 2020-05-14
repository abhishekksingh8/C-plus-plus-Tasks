#include<iostream>
using namespace std;
int main()
{
  int n,p;
  cin>>n;
  
  for(int i=0;i<n;i++)
  {
    p=(11+(4*i))*(11+(4*i));
    cout<<p<<" ";
  }
}
  