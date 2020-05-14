#include<iostream>
using namespace std;
int main()
{
  int c=0;
  float s=0.0;
  while(c<3)
  {
    int n;
    cin>>n;
    
    if(n<0)
    {
      s=s-1.0;
      break;
    }
    else if(n%2!=0)
    {
      s=s+1.0;
      c++;
    }
    else
    {
      s=s-0.5;
    }
  }
    cout<<s;
}