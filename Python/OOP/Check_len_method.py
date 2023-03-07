class Vector:
    def __init__(self, vec):
        self.vec = vec

    def __str__(self) -> str:
        str = ''
        index = 0
        for i in self.vec:
            str += f" {i}a{index} +"
            index += 1
        return str[:-1]

    def __len__(self):
        return len(self.vec)


    

v1 = Vector([1,2,3,4])
v2 = Vector([4,5,6])

print(len(v1))          # len of vector class
print(len(v2))
