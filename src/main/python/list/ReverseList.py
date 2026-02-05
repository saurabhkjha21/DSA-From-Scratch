arr=list(map(int, input().split()))
print(arr)

for i in range(len(arr)-1,-1,-1):
    print(arr[i], end=" ")

print(arr[::-1])
arr.reverse()
print(arr)

left,right=0, len(arr)-1
while left<right:
    arr[left],arr[right]=arr[right],arr[left]
    left+1
    right-1
print(arr)
