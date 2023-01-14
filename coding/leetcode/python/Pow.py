class Solution:
    def runner(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        if x == 0e0:
            return 0
        if n == 1:
            return x
        val:float = self.runner(x, abs(n//2))
        if n%2 == 0:
            return val*val
        else:
            return x*val*val

    def myPow(self, x: float, n: int) -> float:
        if n < 0:
            return self.runner(1/x, -n)
        else:
            return self.runner(x, n)

