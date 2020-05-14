#include <iostream>
using namespace std;

int main() {
    string line,t;
    getline(cin, line);

    for(int i = 0; i < line.size(); ++i)
    {
        if (((line[i] >= 'a' && line[i]<='z') || (line[i] >= 'A' && line[i]<='Z')))
        {
            t+=line[i];
        }
    }
    cout<<t;    
    return 0;
}