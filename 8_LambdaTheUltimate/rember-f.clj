(defn rember-f [test? a l]
  (when (seq l)
    (if (test? a (first l))
      (rember-f test? a (rest l))
      (cons (first l) (rember-f test? a (rest l))))))