d = round(float(input()) * 100)

bills = [10000, 5000, 2000, 1000, 500, 100, 25, 10, 5, 1]

amount = 0.0
used = []

while amount < d:
    for bill in bills:
        if amount + bill <= d:
            used.append(bill / 100)
            amount += bill
            break

ans = {}

for value in used:
    if value in ans.keys():
        ans[value] += 1
    else:
        ans[value] = 1

print(ans)
