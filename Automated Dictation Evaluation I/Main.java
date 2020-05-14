#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char n[100],m[100];
  cin>>n>>m;
  int r=strcmp(n,m);
  if(r==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}