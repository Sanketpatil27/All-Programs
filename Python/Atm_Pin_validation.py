def validate_pin(pin):
    for I in pin:
      if I == " ":
        return False
    try: 
        if len(pin) == 4 or len(pin) == 6:
            a = int(pin)
            print(a)
            return True
        else:
            return False
    except Exception as e:
      print(e)
      return False 

print(validate_pin("987 "))