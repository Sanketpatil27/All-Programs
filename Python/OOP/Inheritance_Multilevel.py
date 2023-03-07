class Person():
    country = "India"

    def takeBreath(self):
        print("I'm Breathing!")


class Emp(Person):
    company = "Air India"

    def takeBreath(self):
        print("I'm Employee, so I am also Breathing!")

    
class Programmer(Emp):
    company = "Nasa"

    # def takeBreath(self):
    #     print("i'm Programmer, I am breathing++")
    

p = Person()
print("person-", p.country)
# print(p.company)            # Error


e = Emp()                   
print('emp-', e.country)
print('emp-', e.company)
e.takeBreath()

pr = Programmer()       # it can access all other properties of classes which are connected
pr.takeBreath()         # if it doesn't have his method then search for all classes above, priority wise, nearest parent 
print('programmer-',pr.country)
print('programmer-',pr.company)