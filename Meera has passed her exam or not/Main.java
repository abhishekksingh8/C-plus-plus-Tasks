#include<iostream>
using namespace std;
int main()
{
  int n,m,c=0;
  cin>>n;
  int a[n];
  
  for(int i=0; i<n;i++)
  {
	cin>>a[i];
  }
  
  cin>>m;
  
  for(int i=0;i<n;i++)
  {
    if(m==a[i])
      c=c+1;
  }
  
	if(c==1)
      cout<<"She passed her exam";
    else
      cout<<"She failed";	
 }

  
