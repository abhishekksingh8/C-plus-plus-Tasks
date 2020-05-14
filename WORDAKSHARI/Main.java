#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string s,t;
  int c=0,a;
  
  do
  {
      t=s;
      getline(cin,s);
      if(c==0)
        cout<<s<<endl;
      a=t.length()-1;
      c++;
      if(t[a]==s[0])
        cout<<s<<"\n";
  }while(s!="####");
 
}