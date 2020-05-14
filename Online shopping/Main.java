#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,flip,snap,amaz;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sa;
  cin>>sd;
  cin>>ss;
  cin>>aa;
  cin>>ad;
  cin>>as;
  
  flip=(int)(fa-(0.01*fd*fa))+fs;
  snap=(int)(sa-(0.01*sd*sa))+ss;
  amaz=(int)(aa-(0.01*ad*aa))+as;
  
  cout<<"In Flipkart Rs."<<flip<<endl;
  cout<<"In Snapdeal Rs."<<snap<<endl;
  cout<<"In Amazon Rs."<<amaz<<endl;
  
  if(flip<=snap && flip<=amaz)
  {
    cout<<"He will prefer Flipkart"<<endl;
  }
  else if(snap<=flip && snap<=amaz)
  {
    cout<<"He will prefer Snapdeal"<<endl;
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
}