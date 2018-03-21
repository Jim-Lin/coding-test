> Using a function rand7() that returns an integer from 1 to 7 (inclusive) with uniform probability, implement a function rand5() that returns an integer from 1 to 5 (inclusive).

```text
P(x=1)=1/7 + (2/7) * 1/7 + (2/7)^2 * 1/7 + (2/7)^3 * 1/7 + ...
      =1/7 * (1 + 2/7 + (2/7)^2 + ...) // 等比数列
      =1/7 * 1 / (1 - 2/7)
      =1/7 * 7/5
      =1/5
```

from [Cracking the coding interview--Q19.10](http://www.hawstein.com/posts/19.10.html)
