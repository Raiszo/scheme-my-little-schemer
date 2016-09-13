# The little schemer

> While the good citizen rests his feets at home,
> the brave warrior stands at the battleground willing to learn some Lisp

## About

This repo tries to follow the [clojure style guide](https://github.com/bbatsov/clojure-style-guide).


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

![cover](/img/readimg.jpg)
