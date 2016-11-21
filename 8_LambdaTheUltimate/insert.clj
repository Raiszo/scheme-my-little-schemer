(def insertL-f
  (fn [test?]
    (fn [new old l]
      (when (seq l)
        (if (test? (first l) old)
          (cons new (cons old (rest l)))
          (cons (first l) ((insertL-f test?) new old (rest l))))))))

(def insertR-f
  (fn [test?]
    (fn [new old l]
      (when (seq l)
        (if (test? (first l) old)
          (cons old (cons new (rest l)))
          (cons (first l) ((insertR-f test?) new old (rest l))))))))