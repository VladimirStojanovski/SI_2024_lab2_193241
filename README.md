## Владимир Стојановски 19324
### Control Flow Graph
![image](https://github.com/VladimirStojanovski/SI_2024_lab2_193241/assets/160274229/25c8112c-c6b1-401e-b90a-078a43124d97)

*****
### Цикломатска комплекност
Цикломатската комплексност на овој CFG е 10.
- број на ребра - број на јазли + 2
> 36 - 28 + 2 = 10
- број на предикатни јазли + 1
> 9 + 1 = 10
*****
### Test cases според критериумот Every Branch
Every branch coverage може да се постигне со 5 test cases.
1. - allItems = null
   - payment = X
   > RuntimeException: allItems list can't be null!
2. - allItems да содржи:  `Item item = new Item("", "1234abc", X, X);`
   - payment = X
   > RuntimeException: Invalid character in item barcode!
3. - allItems да содржи:  `Item item = new Item("name", null, X, X);`
   - payment = X
   > RuntimeException: No barcode!
4. - allItems да содржи:  `Item item = new Item("name", "123", 100, 0);`
   - payment = 400
   > true
5. - allItems да содржи:  `Item item = new Item("name", "0123", 350, 2);`
   - payment = 400
   > false
*****
### Test cases според критериумот Multiple Condition за условот:
`if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')`

Multiple Condition coverage може да се постигне со 1 test case.
allItems да ги содржи следните 4 items:

 - Item item1 = new Item(X, "0123", 500, 2); `TTT`
 - Item item2 = new Item(X, "123", 500, 2); `TTF`
 - Item item3 = new Item(X, X, 500, 0); `TFX`
 - Item item4 = new Item(X, X, 100, X); `FXX`
