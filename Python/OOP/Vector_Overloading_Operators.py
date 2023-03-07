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

    def __add__(self, vec2):            # vec2 is for second vector!
        
        if len(self.vec) > len(vec2.vec) or len(self.vec) < len(vec2.vec):
            return "addition failed, length is not same"

        else:
            newList = []
            for i in range(len(self.vec)):
                newList.append(self.vec[i] + vec2.vec[i])       # addition of vector 1(i) with vector 2 (i)
            return Vector(newList)
    
    def __mul__(self, vec2):            
        
        if len(self.vec) > len(vec2.vec) or len(self.vec) < len(vec2.vec):
            return "multiplication failed, length is not same"
        else:    
            sum = 0 
            for i in range(len(self.vec)):
                sum += self.vec[i] * vec2.vec[i]
            return sum

    def __len__(self):
        return len(self.vec)

    

v1 = Vector([1,2,3])
v2 = Vector([4,5,6])

print(v1)
print(v2)
print(' addition:')
print(v1 + v2)

print(' mul:', end= '  ')
print(v1 * v2)