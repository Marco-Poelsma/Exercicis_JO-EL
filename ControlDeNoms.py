nom=input()
if len(nom) == 1:
    print("NO")
else:
    nom=list(nom)
    found= True
    for i in range(len(nom)):
        if i != 0:
            if nom[i] == nom[i-1]:
                found = False
            else:
                found = True
                break
    if found:
        print("SI")
    else:
        print("NO")                
