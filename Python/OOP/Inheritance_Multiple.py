class Emp():
    company = "Visa"
    eCode = 123


class Freelancer():
    company = "Fiverr"
    lavel = 1

    def upgrade(self):
        self.lavel += 1


class Programmer(Emp, Freelancer):      # Priority to the first class when ambiguity
    name = "Rahul"



p = Programmer()

p.upgrade()
print(p.lavel)
print(p.eCode)
print(p.company)        # print class attribute which has higher priority