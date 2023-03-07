# class always in pascal case (first letter capital):
class Employee:
    company = 'Google'


harry = Employee()      #creating instance(Object)  of class
larry = Employee()


print(harry.company)   # class attribute

harry.salary = 100000   # we can create instance attribute, preference to instance attribute
print(harry.salary)


larry.company = 'Apple'
print(larry.company)    # this won't change class attribute, it will create its own instance attribute
print(Employee.company)  