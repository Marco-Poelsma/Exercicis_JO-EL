n_plats, n_pinyons = map(int, input().split())
plats = []
pinyons = []

plats = list(map(int, input().split()))

pinyons = list(map(int, input().split()))

plats.sort()
pinyons.sort(reverse=True)

for plat in plats:
    for pinyo in pinyons:
        print(f"({plat},{pinyo})", end="\n")