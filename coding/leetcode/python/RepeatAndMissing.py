class RepeatAndMissing:
    def repeatAndMissingNumber(self, inputArr):
        result = []
        for i in inputArr:
            if(inputArr[abs(i) - 1] < 0):
                result.append(abs(i))
            else:
                inputArr[abs(i) - 1] = -1*inputArr[abs(i) - 1];

        for i in range(len(inputArr)):
            if(inputArr[i] > 0):
                result.append(i + 1)
                break
        return result