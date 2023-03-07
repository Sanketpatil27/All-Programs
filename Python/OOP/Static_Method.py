class Employee:
    company = 'Google'

    @staticmethod        # we have to write this when we don't want to pass self parameter
    def getSalary():    
        print('Good Morning')


harry = Employee()
harry.salary = 1000000          

harry.getSalary()  # after static this is converted to -> Employee.getSalary() 