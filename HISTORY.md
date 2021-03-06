### 2022-06-29

#### #1

##### 요구 사항

현재 스파르타 카페는 주문을 하면 해당 물품의 이름을 그대로 돌려주는 방식으로 운영되고 있다. 하지만 몇몇 손님들은 주문에 대한 결과로 물품의 이름만 얻어오는 것이 아니라, 가격이나 유통기한 등의 정보도 알고 싶어 한다.

이러한 요구 사항을 해결하기 위해 물품에 대한 정보를 담고 있는 `Item` 클래스를 도입해 보자.

##### 사용 개념

- 클래스
- 필드

#### #2

##### 요구 사항

현재 스파르타 카페는 원하는 물품의 이름으로 주문하면 해당 물품을 공짜로 주는 방식으로 운영되고 있다. 스파르타 카페의 사장님은 이렇게 하다간 빚더미에 깔리겠다며, 돈을 받고 물품을 판매하려고 한다.

이러한 요구 사항을 해결하기 위해 특정 물품에 대한 가격을 획득할 수 있는 `getPrice()` 메서드를 도입하고, 주문할 때 돈을 같이 받도록 변경해 보자.

##### 사용 개념

- 메서드

#### #3

##### 요구 사항

어느 날 갑자기 스파르타 카페에 진상 손님이 들이닥쳐 판매하지도 않는 스무디를 만들어달라고 한다. 스파르타 카페의 사장님은 커피, 에이드, 케이크만 만들 줄 알기 때문에, 만들 수 없는 물품에 대해서는 주문할 수 없다고 알려주려고 한다.

이러한 요구 사항을 해결하기 위해 판매하지 않는 물품에 대한 가격을 물어보거나, 주문을 한다면 예외를 던져주도록 하자.

##### 사용 개념

- 예외 처리

#### #4

##### 요구 사항

어떤 손님이 찾아와 커피 가격을 물어보길래 친절하게 알려드렸는데, 무작정 깎아달라며 1000원을 덜 내려고 한다. 스파르타 카페의 사장님은 1000원을 깎으면 카페가 망하기 때문에, 이러시면 안 된다고 말씀드리려고 한다.

이러한 요구 사항을 해결하기 위해 판매 가격에 맞지 않는 돈을 지불할 경우 예외를 던져주도록 하자.

##### 사용 개념

- 예외 처리

### 2022-07-07

#### #1

##### 요구 사항

현재 스파르타 카페는 모든 물품을 점원의 주머니에 넣어 놓고 판매하고 있기 때문에, 주머니가 터질 때마다 점원이 터진 곳을 꿰매느라 주문이 밀리게 된다. 스파르타 카페의 사장님은 주문이 밀리면서 생기는 손실이 점차 커지자, 물품들을 보관할 창고를 구매하려 한다.

이러한 요구 사항을 해결하기 위해 창고 클래스를 만들고, 그곳에 물품들을 보관하도록 하자.

##### 사용 개념

- 합성

#### #2

##### 요구 사항

어느 날 갑자기 스파르타 카페의 사장님은 판매하고 있는 물품들을 세분화해둬야겠다는 생각이 들어, 물품을 먹을 것과 마실 것으로 분류하고 각각을 먹는 방법까지 적어두려 한다.

이러한 요구 사항을 해결하기 위해 `Item` 클래스를 상속받아, `Food` 클래스와 `Drink` 클래스를 만들자. 그리고 `Item` 클래스에 `showTakeMethod()` 추상 메서드를 선언해놓고, `Food` 클래스와 `Drink` 클래스에서 오버라이딩하자.

##### 사용 개념

- 추상 클래스
- 상속
- 오버라이딩
- 다형성