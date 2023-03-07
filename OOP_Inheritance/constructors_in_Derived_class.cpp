#include<iostream>

using namespace std;

class base1
{
    int data1;
    public:
        base1(int i)
        {
            data1 = i;
            cout << "Base1 constructor called!" << endl;
        }
        void printbase1()
        {
            cout << "Data1 = " << data1 << endl;
        }
};

class base2
{
    int data2;
    public:
        base2(int m)
        {
            data2 = m;
            cout << "Base2 constructor called!" << endl;
        }
        void printbase2()
        {
            cout << "Data2 = " << data2 << endl;
        }
};

class derived : public base1, public base2      //if virtual class presentr it const. called first then base class || if both base then sequencewise
{
    int derived1, derived2;
    public:
        derived(int k, int j) : base1(34), base2(j)  //initialize value to constructors
        {
            derived1 = k;
            derived2 = j;
            cout << "derived constructor called!!" << endl;
        }
        void printderived()
        {
            cout << "derived1 = " << derived1 << endl;
            cout << "derived2 = " << derived2 << endl;
        }
};

int main()
{
    derived x(2,4);

    x.printbase1();
    x.printbase2();
    x.printderived();

    return 0;
}