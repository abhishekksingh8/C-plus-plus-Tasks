#include<iostream>
using namespace std;

int main()
{
  int c,a1,a2,b1,b2,s1,s2;
  cin>>c;
  
  switch(c)
  {
    case 1:
    	cin>>a1>>a2>>b1>>b2;
    	cout<<a1+b1<<"+"<<a2+b2<<"i";
    	break;
      
    case 2:
    	cin>>a1>>a2>>b1>>b2;
      	if(a2>b2)
          cout<<a1-b1<<"+"<<a2-b2<<"i";
      	else
          cout<<a1-b1<<"-"<<a2-b2<<"i";
    	break;
      
    case 3:
      	cin>>a1>>a2>>b1>>b2;
        s1=a1*b1+(-(a2*b2));
        s2=a1*b2+a2*b1;
        if(a1*b2>a2*b1)
          cout<<s1<<"+"<<s2<<"i";
      	else
          cout<<s1<<s2<<"i";
        break;
      
      
    default:
      cout<<"Invalid choice";
  }
}