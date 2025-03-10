import math
def solution(numbers):
    if not numbers: # 배열이 비어 있으면 return 0
        return 0
    count = len(numbers)
    answer = sum(numbers) / count
    return answer