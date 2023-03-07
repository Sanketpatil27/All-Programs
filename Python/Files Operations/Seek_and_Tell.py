# tell() - this tells the character now reading in file
# seek() - this will tell from where(in characters) to start the reading

with open('Files Operations/for_seek_and_tell.txt') as f:
    print("this file now at character:",f.tell())             
    print(f.readline())
    print(f.readline())
    print("this file now at character:",f.tell()) 
    print("After seeking: ") 
    print('it will start from', f.seek(8))
    f.seek(8)
    print(f.readline())