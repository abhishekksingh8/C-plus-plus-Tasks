#include<string>
#include<iostream>
using namespace std;
int main()
{
  string s,s1,t;
  getline(cin,s);
  getline(cin,t);
  for(int i=s.length()-1;i>-1;i--)
  {
    s1+=s[i];
  }
  
  if(s1==t)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}