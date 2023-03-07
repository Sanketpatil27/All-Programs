class Person():
    country = "India"

    def takeBreath(self):
        print("I'm Breathing!")


class Emp(Person):

    def takeBreath(self):
        super().takeBreath()
        print("I'm Employee, so I am also Breathing!")

    
class Programmer(Emp):

    def takeBreath(self):
        super().takeBreath()        # first go to emp fun, then that fun go parent(person) fun first
        print("i'm Programmer, I am breathing++")
    


p = Person()
p.takeBreath()

e = Emp()                   
e.takeBreath()

pr = Programmer()
pr.takeBreath()

