#include<iostream>

using namespace std;

class base
{
    public:
        void greet()
        {
            cout << "How are you?" << endl;
        }
};
class first : public base
{
    public:
        void greet()
        {
            cout << "kaise hai aap log?" << endl;
        }
};
class derived : public base, public first
{
    public:
        void greet()
        {
            first :: greet();
        }
};


int main()
{
    // base x;
    // x.greet();

    // first y;
    // y.greet();

    derived u;
    u.greet();

    return 0;
}

