row, col=map(int,input().split())
matriz=[]
for i in range(row):
    fila = list(map(int, input().split())) 
    matriz.append(fila)

x, y=map(int,input().split())

result=0

for i in range(row):
    for j in range(col):
        if i == x or j == y:
            # aux=matriz[i][j]
            result+=int(matriz[i][j])

print(result)
