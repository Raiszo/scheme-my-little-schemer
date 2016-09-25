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

However the equivalence in clojure for sequences may be using `seq` and `when`:

```clojure
;If lat is not 'seq' then is an empty list;
;When the condition is false, 'when' returns
;'nil' which is equivalent to and empty string.

(when (seq lat) ...)
```

### The Second Commandment

> Use cons to build lists

For example in the [rember](3_ConsTheMagnificent/rember.clj) function, in the recursion call we build the new list
using cons:

```clojure
(cons (first lst) (rember a (rest lst)))
```
Find the book
[here](https://www.amazon.com/Little-Schemer-Daniel-P-Friedman/dp/0262560992/ref=sr_1_1?ie=UTF8&qid=1473739422&sr=8-1&keywords=little+schemer)

![cover](/img/readimg.jpg)
