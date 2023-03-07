class Emp:
    salary = 100

    # def changeSal(self, sal):
    #     self.salary = sal              # doesn't change the class attribute
    #     self.__class__.salary = sal    # to change the class attribute


    @classmethod                        # to directly change the class attribute
    def changeSal(cls, sal):        
        cls.salary = sal                # it can directly access the class attributes


e = Emp()
print(e.salary)
e.changeSal(309)
print(e.salary)
print(Emp.salary)