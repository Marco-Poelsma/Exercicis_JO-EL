import re
casos = int(input())
lista=[]
for _ in range(casos):
    mano = list(map(int, input().split()))
    mano = sorted(set(mano))
    manofinal = " ".join(map(str, mano))
    
    manofinal=""
    patron="1 2 3 4 5"
    patronreal="9 10 11 12 13"
    manofinal = " ".join(map(str, mano))

    matc=re.search(patron, manofinal)
    matcr=re.search(patronreal, manofinal)
    
    if matc:
        lista.append("ESCALA")
    elif matcr:
       lista.append("ESCALA REIAL")    
    else:
        lista.append("NO")
for i in lista:
    print(i)
