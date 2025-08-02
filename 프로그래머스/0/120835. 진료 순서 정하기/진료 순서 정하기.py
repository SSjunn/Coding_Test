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
