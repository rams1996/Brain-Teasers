class Solution:
    def getLastMoment(self, n: int, left: List[int], right: List[int]) -> int:
        r=[]
        l=[]
        for i in right:
            r.append(n-i)
        l=left.copy()
        r.append(float('-inf'))
        l.append(float('-inf'))
        val=max(max(r),max(l))
        return val
        
        
