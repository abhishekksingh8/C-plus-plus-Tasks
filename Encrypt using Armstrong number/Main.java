#include<iostream>
#include<bits/stdc++.h>
int arm(int n)
{
  int temp=n,n1=n,c=0,r,s=0;
    while(n>0)
    {
      c++;
      n=n/10;
    }
  while(n1>0)
    {
      r=n1%10;
      s=s+pow(r,c);
      n1=n1/10;
    }
  if(temp==s)
    return 1;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}