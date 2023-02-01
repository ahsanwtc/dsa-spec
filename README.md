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

No. $\sqrt{n} = n^\frac{1}{2}$
