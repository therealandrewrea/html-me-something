def get_initials(fullname):
    initials = "" #collect name, initialize intials string to 0
    #identify spaces to return index of first characters of names index 0 and index (space +1)
    firstinit = fullname[0]
    firstinit = firstinit.upper()
    initials = initials + firstinit
    for i in range(len(fullname)):
        if fullname[i] == " ":
            secondinit = fullname[i+1]
            secondinit = secondinit.upper()
            initials = initials + secondinit
    return initials

#def main():
    #name = input("What is your name?")
    #inits = get_initials(name)
    #print("The initials of '"+ name +"' are", inits)

    #if __name__ == '__main__':
        #main()

#main()
