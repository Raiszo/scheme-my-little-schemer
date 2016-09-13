# The little schemer

> While the good citizen rests his feets at home,
> the brave warrior stands at the battleground willing to learn some Lisp

## About

This repo tries to follow [this clojure style guide](https://github.com/bbatsov/clojure-style-guide).


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

[Jorge Miranda](peppa-peddler.github.io), 
Ebert Choquehuanca

Find the book
[here](https://www.amazon.com/Little-Schemer-Daniel-P-Friedman/dp/0262560992/ref=sr_1_1?ie=UTF8&qid=1473739422&sr=8-1&keywords=little+schemer)

![cover](/img/readimg.jpg)
