def solution(emergency):
    # 1. 내림차순 정렬해서 순위 정보 만들기
    rank = {num: i+1 for i, num in enumerate(sorted(emergency, reverse=True))}
    
    # 2. 원래 배열 순서대로 순위 매기기
    answer = [rank[num] for num in emergency]
    return answer

# 1단계 : 내림차순 정렬
# sorted(emergency, reverse=True)

# 정렬된 리스트에 순서 부여
# for i, num in enumerate([])

다른 방법
def solution(emergency):
    n = len(emergency)
    # 모든 사람의 초기 등수는 1등으로 설정
    rank = [1] * n

    # 자기보다 높은 숫자가 몇개인지
    for i in range(n):
        for j in range(n):
            if emergency[i] < emergnecy[j]:
                ranke[i]+= 1

reutnr rank
            
