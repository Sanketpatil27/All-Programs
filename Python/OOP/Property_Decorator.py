class Emp:
    salary = 1500
    salaryBonus = 200

    @property               # Also called getter
    def totalSal(self):
        return self.salary + self.salaryBonus

# setter method run after the updation(set value to property) in property like(e.totalSal = 2000)

    @totalSal.setter                # it changes the salary and bonus according to totalSal property
    def totalSal(self, val):        # here value is 200 (set to the property), changed valued is assigned
        self.salaryBonus = val - self.salary
    


e = Emp()
print("total:",e.totalSal)           # this is property so doesn't have parenthesis 
print("salary:",e.salary)       
print('bonus:',e.salaryBonus)  

e.totalSal = 2000           # we can change the property using setter in this 
print('after updating:')
print("total:",e.totalSal)           
print("salary:",e.salary)       
print('bonus:',e.salaryBonus)