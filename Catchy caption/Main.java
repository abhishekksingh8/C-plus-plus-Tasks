#include <cstring>
using namespace std;
#include <iostream>
int main()
{
   	string s;
  	int c=0;
  	getline(cin,s);
  	for(int i=0;i<s.length();i++)
    {
      if(s[i]==' ')
        c++;
    }
  
  	if(c+1<10)
      cout<<"Caption eligible for the contest";
    else
      cout<<"Caption not eligible for the contest";
   
}