#include<iostream>
using namespace std;
int main()
{
  int wb,na,nc,tw;
  cin>>wb;
  cin>>na;
  cin>>nc;
  tw=(75*na)+(30*nc);
  
  if(wb>=tw)
  {
    cout<<"Boat is stable";
  }
  else
  {
      cout<<"Boat will drow";
  }
}