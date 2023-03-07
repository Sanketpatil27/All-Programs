# write a python program to secure an existing password by replacing a set of characters with
# the currosponding 'password secure' character(provided as tuple).
# ex: SECURE = (('s', '$'), ('and', '&'), ('a', '@'), ('o', '0'), ('i', '1'), ('I', '|') )


SECURE = (('s', '$'), ('and', '&'), ('a', '@'), ('o', '0'), ('i', '1'), ('I', '|') )

def securePassword(password):
    for e, r in SECURE:
        if e in password:
            password = password.replace(e, r)
    return password


if __name__ == '__main__':
    
    password = input('Enter your password: ')
    password = securePassword(password)
    print(password)
