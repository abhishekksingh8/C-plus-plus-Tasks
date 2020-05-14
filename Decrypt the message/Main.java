#include<iostream>
using namespace std;
int main()
{ 
  int n,n1,i,s=0;
  cin>>n;
  cin>>n1;

  for(i=1;i<(n+n1);i++)
  {
    if((n+n1)%i==0)
    {
      s=s+i;
    }
  }

	if(s==(n+n1))
      cout<<"They can read the message";
      else
        cout<<"They can't read the message";
}