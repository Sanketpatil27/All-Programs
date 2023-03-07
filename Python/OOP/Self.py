class Employee:
    company = 'Google'
    def getSalary(self):        # there can be any variable in place of self
        print(f'Salary of this emp working in {self.company} is {self.salary}')


harry = Employee()
harry.salary = 1000000          

harry.getSalary()  # this is converted to -> Employee.getSalary(harry)    therefor self is needed, it instance in parameter