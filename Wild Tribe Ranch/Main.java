#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>m;
  cin>>n;
  
 if(n<m)
    cout<<"Yes, you can enter.";
  else if(n==m)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
  
}