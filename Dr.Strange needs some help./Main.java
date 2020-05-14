#include<iostream>
using namespace std;
int exp(int a, int b, int c);

int main()
{
  int m,n,req,a;
  cin>>m>>n>>req;
  a=exp(m,n,req);
  if(a==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}

int exp(int a,int b,int c)
{
  int p=1;
  for(int i=1;i<=b;i++)
  {
    p=p*2;
  }
  if(p>=c)
    return 1;
  else 
    return 0;
}


    
  