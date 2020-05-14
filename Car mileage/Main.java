#include<iostream>
using namespace std;
int main()
{
  float mg;
  int l,d;
  cin>>mg;
  cin>>l;
  cin>>d;
  
  if(d<=mg*l)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
  
}