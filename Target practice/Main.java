#include<iostream>
using namespace std;
int main()
{
  int t,s=0,m;
  cin>>t;
  
 while(s<t)
  {
    int n;
    cin>>n;
    s=s+n;
    m++;
  }

  cout<<"The number of turns is "<<m;
}