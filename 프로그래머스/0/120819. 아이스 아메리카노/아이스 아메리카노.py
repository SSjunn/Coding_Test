def solution(money):
    price = 5500  # 아이스 아메리카노 한 잔 가격
    cups = money // price  # 최대로 마실 수 있는 잔 수 (정수 나눗셈)
    change = money % price  # 남은 돈 (나머지 연산)
    return [cups, change]