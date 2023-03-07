nm = input("Enter your name: ")
mark = input("Enter your Marks: ")
num = input("Enter your Phone number: ")

sentence = "The name of the student is {}, his marks are {}, and phone number is {}"
print(sentence.format(nm, mark, num))