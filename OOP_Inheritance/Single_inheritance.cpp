#include<iostream>

using namespace std;
/*
syntax:
class a
{

};
calss b: public a
{

};
*/

class add
{
    public:
    int a, b, c;

    void enter()
    {
        cout << "\nEnter two numbers: ";
        cin >> a >> b;
    }
    void sum()
    {
        c = a + b;
        cout << "\nAddition = " << c;
    }
};

class subs : public add
{
    public:
    // int a, b, c;

    // void enter1()
    // {
    //     cout << "\nEnter two numbers: ";
    //     cin >> a >> b;
    // }
    void sub()
    {
        c = a - b;
        cout << "\nSubstraction = " << c;
    }
};

int main()
{
    subs x;

    x.enter();
    x.sum();
    // x.enter1();
    x.sub();

    return 0;
}