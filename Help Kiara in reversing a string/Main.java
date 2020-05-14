#include <iostream>
#include<string>
using namespace std;  

int main()
{
    string str;
    getline(cin,str);
    for (int x = str.length() - 1; x > -1; x--)
    {
        cout<<str[x];
    }
    return 0;
}
