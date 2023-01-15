class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        matrix = [0 for j in range(n)]
        matrix[0] = 1

        for i in range(m):
            for j in range(n):
                if i == 0 and j == 0:
                    continue;
                if i == 0:
                    matrix[j] = matrix[j-1]
                elif j == 0:
                    matrix[j] = matrix[j]
                else:
                    matrix[j] = matrix[j-1] + matrix[j]

        return matrix[n-1]
