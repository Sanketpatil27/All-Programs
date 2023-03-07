#include <iostream>
#include <cmath>

using namespace std;

class simpleCalculator
{
    int a, b;

public:
    void get()
    {
        cout << "\nEnter values of a & b to perform simple operations: " << endl;
        cin >> a >> b;
    }
    void put()
    {
        cout << "Addition of a & b = " << a + b << endl;
        cout << "Substraction of  a & b = " << a - b << endl;
        cout << "Multiplicaton of a & b = " << a * b << endl;
        cout << "Division of a & b= " << (float)a / b << endl;
    }
};

class scientificCalculator
{
    int a, b;

public:
    void get1()
    {
        cout << "\nEnter values of a & b to perform scientific operations: " << endl;
        cin >> a >> b;
    }
    void put1()
    {
        cout << "Value of sin(" << a << ") = " << sin(a) << endl;
        cout << "Value of cos(" << b << ") = " << cos(b) << endl;
        cout << "Value of exp(" << a << ") = " << exp(a) << endl;
        cout << "Value of tan(" << b << ") = " << tan(b) << endl;
    }
};

class HybridCalculator : public simpleCalculator, public scientificCalculator
{
    // public:
    //     void display()
    //     {
    //         get();
    //         put();
    //         get1();
    //         put1();
    //     }
};

int main()
{
    HybridCalculator x;
    x.get();
    x.put();
    x.get1();
    x.put1();

    return 0;
}