#include<iostream>
using namespace std;
int main()
{
  int n,s=0;
  cin>>n;
  cout<<n<<endl;
  while(n>1)
  {
    if(n%2==0)
    {
      n=n/2;
   	  s++;
      cout<<n<<endl;
    }
    else
    {
      n=(3*n)+1;
      s++;
      cout<<n<<endl;
  	}
  }
  cout<<s;
}
