#include<iostream>
using namespace std;
int main()
{
  int n,s=0,so=0,se=0,r;
  cin>>n;
  
  while(n>0)
  {
	r=n%10;
    if(s%2==0)
      se=se+r;
    else
      so=so+r;
    s++;
    n=n/10;
  }
  if(se==so)
    cout<<"Yes";
  else
    cout<<"No";
}
  