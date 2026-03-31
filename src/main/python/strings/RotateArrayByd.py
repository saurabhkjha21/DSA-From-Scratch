class Solution:
    def rotateArr(self, arr, d):
        #Your code here
        n=len(arr)
        d=d%n
        
        self.swap(arr, 0, d-1)
        self.swap(arr, d, n-1)
        self.swap(arr, 0, n-1)
        
        
    def swap(self, arr, left, right):
        while left < right:
            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1
        
