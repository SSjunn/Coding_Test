def solution(age):
    answer = ''
    for i in str(age):
        answer += chr(int(i) + 97)
    return answer

'''
    아스키코드 'a' = 97
    a=0, b=1, c=2... 이렇다면 
    age = 23이라면 str(age) -> '2', '3' 꺼냄
    char(int(i) + 97) -> char(2+97) = c 가 출력 그러면 예시의 2를 했는데 c가 나오는게 맞다.
'''
