#include <iostream>
using namespace std;
void swap(int * num1, int * num2);

int main()
{
    int num1, num2;
    cin>>num1>>num2;
    cout<<"Before swapping a= "<<num1<<" and b="<<num2<<endl;
    swap(&num1, &num2);
    cout<<"After swapping a= "<<num1<<" and b="<<num2;
    return 0;
}

void swap(int * num1, int * num2)
{
    int temp;
    temp = *num1;
    *num1= *num2;
    *num2= temp;
}