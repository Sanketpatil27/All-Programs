#include<iostream>

using namespace std;

/*
            student 
    test                sports
            result
*/

class stud
{
    protected:
        int roll;
        char name[20];
    public:
        void set_info()
        {
            cout << "\nEnter Name & roll no of student To display Result: \n";
            cin >> name >> roll;
        }
        void print_info()
        {
            cout << "\nName = " << name << endl
                 << "Roll no = " << roll << endl;
        }
};

class test : virtual public stud
{
    protected:
        float maths, programing;
    public:
        void set_marks(float m1, float m2)
        {
            maths = m1;
            programing = m2;
        }
        void print_marks()
        {
            cout << "Mark in Maths = " << maths << endl
                 << "Mark in Programing = " << programing << endl;
        }
};

class sports : virtual public stud
{
    protected:
        float score;
    public:
        void set_score(int sc)
        {
            score = sc;
        }
        void print_score()
        {
            cout << "Your Score in games = " << score << endl;
        }
};

class result : public test, public sports
{
    private:
        float total;
    public:
        void print_result()
        {
            total = maths + programing + score;

            print_info();
            print_marks();
            print_score();
            
            cout << "Your Result is: " << total << endl;
            cout << "\n";
        }
};

int main()
{
    result x;

    x.set_info();
    x.set_marks(98.90,99.99);
    x.set_score(10);
    x.print_result();

    return 0;
}