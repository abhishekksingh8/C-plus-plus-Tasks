#include<iostream>
using namespace std;
int main()
{
  int n;
  float ht;
  
  cin>>n;
  cin>>ht;
  
  if(n==1)
    cout<<ht;
  else if(n==2)
    cout<<(ht+(0.5*ht));
  else if(n==3)
    cout<<(2*ht);
  else
    cout<<"Number of items is more";
  
  
  
  
}