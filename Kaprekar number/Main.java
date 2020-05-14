#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  int num,n,temp,f=0,s=0,l=0,sum=0,p;
  cin>>num;
  temp=num;
  n=num*num;
  
  while(num>0)
  {
    s++;
    num=num/10;
  }
  p=pow(10,s);
  f=n/p;
  l=n%p;
  sum=l+f;
  if(sum==temp)
    cout<<"Kaprekar Number";
    else
    cout<<"Not a Kaprekar Number";  
    
}