# Data Structures and Algorithms Specialization

## Big O

### 1. Introduction and Learning Outcomes
Recall that we write $f(n) = O(g(n))$ to express the fact that $f(n)$ grows no faster than $g(n)$: there exist 
constants $N$ and $c > 0$ so that for all $n \geq N, f(n) \leq c⋅g(n)$.

Is it true that $log{_2}{n} = O(n^2)$

Yes. A logarithmic function grows slower than a polynomial function.

### 1. $nlog{_2}{n} = O(n)$

No. To compare these two functions, one first cancels $n$. What is left is $log{_2}{n}$ versus $1$. Clearly, $log{_2}{n}$
grows faster than $1$.

### 3. $n^2 = O(n^3)$

Yes. $n^a$ grows slower than $n^b$ for constants $a < b$.

### 4. $n = O(\sqrt{n})$

No. $\sqrt{n} = n^\frac{1}{2}$ grows slower than $n = n^1 as \frac{1}{2} < 1$.

### 5. $5log{_2}{n} = O(n^2)$

No. Recall that $a^log{_b}{c} = c^log{_b}{a}$ so $5log{_2}{n} = nlog{_2}{5}$. This grows faster than $n^2$ since
$log{_2}{5} = 2.321... > 2$.

### 6. $n^5 = O(2^3log{_2}{n})$

No. $2^3log{_2}{n} = (2log{_2}{n})^3 = n^3$ and $n^3$ grows slower than $n^5$.

### 7. $2^n = O(2^n+1)$

Yes. $2^n+1 = 2 . 2^n$, that is, $2^n$ and $2^n+1$ have the same growth rate and hence $2^n = \theta(2^n+1).