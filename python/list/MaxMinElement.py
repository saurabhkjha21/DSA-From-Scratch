n=int(input("Enter a number: "))
arr=list(map(int, input().split()))[:n]
max_val=arr[0]
min_val=arr[0]

for  i in range(len(arr)):
    if arr[i]>max_val:
        max_val=arr[i]
    if arr[i]<min_val:
        min_val=arr[i]

print("max: ",max_val)
print("min: ",min_val)

for i in range(len(arr)):
    max_val=max(max_val, arr[i])
    min_val=min(min_val, arr[i])

print(min_val)
print(max_val)