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
class c: public b
{

}
*/


class stud
{
    public:
    int roll;
    char name[20], dept_name[30],city_name[30];

    void get()
    {
        cout << "Enter name & roll no of student: ";
        cin >> name >> roll;
    }
    void put()
    {
        cout << "\nName = " << name;
        cout << "\nRoll No. = " << roll << endl;
    }
};

class dept: public stud
{
    public:
    void get1()
    {
        cout << "Enter Department Name: ";
        cin >> dept_name;
    }
    void put1()
    {
        cout << "Department Name = " << dept_name << endl;
    }
};

class city : public dept
{
    public:

    void get2()
    {
        cout << "Enter city name: ";
        cin >> city_name;
    }
    void put2()
    {
        cout << "City Name = " << city_name << endl;
    }
};

int main()
{
    city z;

    z.get();    
    z.get1();    
    z.get2();    
    cout << "\nDetailes of student: " << endl;
    z.put();    
    z.put1();    
    z.put2();    

    return 0;
}