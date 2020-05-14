#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,h,small;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
  
  if(a<b&&a<<c)
    small=a;
  if(b<a&&b<c)
    small=b;
  else
    small=c;
  
  while(small>=1)
  {
    if(a%small==0&&b%small==0&c%small==0){
      h=small;
      break;}
    else
      small--;
  }
  if(h==d)
    cout<<"Answer is correct.";
    else
      cout<<"Answer is wrong.";
}
      
    
    