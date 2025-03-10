def solution(price):
    if price >= 500000:  # 50만 원 이상이면 20% 할인
        return int(price * 0.80)
    elif price >= 300000:  # 30만 원 이상이면 10% 할인
        return int(price * 0.90)
    elif price >= 100000:  # 10만 원 이상이면 5% 할인
        return int(price * 0.95)
    else:
        return price  # 할인 없음
