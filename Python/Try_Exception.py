while True:
    print("Press q to quit..")

    a = input("Enter a number ")
    if a == 'q':
        break
    try:
        if int(a) > 6 :
            print("Entered value is greater then 6")
        else:
            print("Entered value is less then 6")
    except Exception as e:                          # here's e can be anything
        print("Error is: ",e)