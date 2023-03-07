
# Online Python - IDE, Editor, Compiler, Interpreter

largNum = -99999999
cnt = 0

while True:
    num = int(input('Enter a number or type - 1 to end program: '))
    if num == -1:
        break
    cnt += 1 
    if num > largNum:
        largNum = num
if cnt != 0:
    print('largest num is: ',largNum)
else:
    print('havent entered any number')