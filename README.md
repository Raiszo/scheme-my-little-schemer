#The little schemer

> While a decent citizen rests his feets at home,
> a brave warrior stands at the battleground willing to learn some Lisp

## About

This repo tries to follow [the clojure style guide](https://github.com/bbatsov/clojure-style-guide).


```clojure
(def atom?
  (fn [x]
   (not (seq? x))))

(def null?
  (fn [x]
   (or
    (nil? x)
    (= '() x))))
```
### The First Commandment
The first commandment is about the use of a 'base case' when defining a recursion, which is basically:
> When recurring on an element ask whether it is null or not.

Example when the base case returns an empty list:

```clojure
(if (empty? lat)
  '()
  ...)
```

However a more idiomatic way to this in clojure is by using `seq` and `when`:

```clojure
;If lat is not 'seq' then is an empty list;
;When the condition is false, 'when' returns
;'nil' which is equivalent to and empty string.

(when (seq lat) ...)

;Only if we need to return a null element
;in the base case
```

### The Second Commandment

> Use cons to build lists

Here it just point out the basic operation to build lists.

### The Third Commandment

> When building a list, describe the first typical element, and then cons it onto the natural recursion.

For example in the [rember](3_ConsTheMagnificent/rember.clj) function, in the recursion call we build the new list
using `cons`, also the head element for the list is the first element of lst:

```clojure
(cons (first lst) (rember a (rest lst)))
```

### The Fourth Commandment

>Always change at least one argument while recurring. It
>must be changed to be closer to termination. The changing
>argument must be tested in the termination condition:
>when using cdr, test termination with null?

For example when calling `(rest lst)` will eventually lead us to an empty list:
```clojure
(rember a (rest lst))
```

### The Fifth commandment

>When building a value with +, always use 0 for the value of the
>terminating line, for adding 0 does not change the value of an
>addition.
>When building a value with x, always use 1 for the value of the
>terminating line, for multiplying by 1 does not change the value
>of a multiplication.
>When building a value with cons , always consider () for the value
>of the terminating line. 

This commandment talks about the use of the `identity element` of each
operation as base case.

```clojure
if (zero? m)
 0
```
### The Sixth Commandment

>Simplify only after the function is correct

By `simplify` it means to re-use another function to reduce code and ensure
correctness

```clojure
(defn eq (....
  ))

....
(eq ..)
```

### The Seventh Commandment
>Recur on the subparts that are of the same nature:
>On the sublists of a list; 
>On the subexpressions of an arithmetic expression. 

```clojure
if (seq? aexp)
    (and (numbered? (first aexp)) (numbered? (first (rest (rest aexp)))))
```

### The Eighth Commandment
> Use help functions to abstract from representations. 

For example when calling the functions: `operator`, `fst_sub_aexp` and
`snd_sub_exp` in [value](6_Shadows/value-nexp.clj):

```clojure
((if (= (operator aexp) '+) + - ) (value' (fst_sub_exp aexp)) (value'
(snd_sub_exp aexp)))
```

Find the book
[here](https://www.amazon.com/Little-Schemer-Daniel-P-Friedman/dp/0262560992/ref=sr_1_1?ie=UTF8&qid=1473739422&sr=8-1&keywords=little+schemer)

![cover](/img/readimg.jpg)
