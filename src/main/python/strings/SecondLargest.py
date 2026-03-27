class Solution:
    def getSecondLargest(self, arr):
        # Code Here
        if len(arr)<2:
            return -1
        
        max=float('-inf')
        secMax=float('-inf')
        for num in arr:
            if num > max:
                secMax=max
                max=num
            elif num>secMax and num!=max:
                secMax=num
        
        return secMax if secMax!=float('-inf') else -1
