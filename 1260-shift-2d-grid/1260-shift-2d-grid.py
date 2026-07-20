class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        def singleshift(arr,n):

            last=arr[n-1]
            arr[n-1]=0
            for i in range(n-1,0,-1):
                arr[i]=arr[i]+arr[i-1]
                arr[i-1]=0
            arr[0]=last

            return arr
    
        def shift(grid,m,n):

            for i in range(m):

                grid[i]=singleshift(grid[i],n)

            lastcol=grid[m-1][0]

            grid[m-1][0]=0

            for i in range(m-1,0,-1):
                grid[i][0]=grid[i][0]+grid[i-1][0]
                grid[i-1][0]=0
            grid[0][0]=lastcol

            return grid
            

        m=len(grid)
        n=len(grid[0])

        for i in range(k):
            grid=shift(grid,m,n)

        return grid