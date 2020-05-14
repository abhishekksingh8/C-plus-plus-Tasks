#include<iostream>
using namespace std;
int main()
{
  int r,c,g;
  cin>>r;
  cin>>c;
  int a[r][c];
  
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  
  g=a[0][0];
    
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      if(g<a[i][j])
        g=a[i][j];
    }
  }
    cout<<"The maximum element is "<<g;
           
}