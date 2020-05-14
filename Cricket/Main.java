#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  int b,r,rs,bb;
  cin>>b>>r>>rs>>bb;
  
  float ov=b/6;
  float ov1= (int)bb/6;
  float ov2= 0.1*(bb%6);
  float ovb=ov1+ov2;
  float crr=(rs/ovb);
  float trr=r/ov;
 
  cout<<ov<<"\n"<<ovb<<"\n";
  cout<<fixed<<setprecision(1)<< crr << endl;
  cout<<fixed<<setprecision(1)<<trr<<endl;
    
  if(crr>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}
    
