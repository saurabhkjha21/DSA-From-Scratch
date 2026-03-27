class Solution:
    def thirdLargest(self,arr):
        # code here
        if len(arr)<3:
            return -1
        max=float('-inf')
        secMax=float('-inf')
        thirdMax=float('-inf')
        
        for num in arr:
            if num > max:
                thirdMax=secMax
                secMax=max
                max=num
            elif num>secMax:
                thirdMax=secMax
                secMax=num
            elif num > thirdMax:
                thirdMax=num
                
        return thirdMax if thirdMax !=float('-inf') else -1
