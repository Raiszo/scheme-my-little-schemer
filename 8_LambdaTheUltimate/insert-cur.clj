(def seqL
  (fn [new old l]
    (cons new (cons old l))))

(def seqR
  (fn [new old l]
    (cons old (cons new l))))

(def seqS
  (fn [new old l]
    (cons new l)))

(def seqrem
  (fn [new old l] l))

(def insert-g
  (fn [seqF]
    (fn [new old l]
      (when (seq l)
        (if (= old (first l)) 
          (seqF new old (rest l))
          (cons (first l) ((insert-g seqF) new old (rest l))))))))

(def insertR (insert-g seqR))
(def insertL (insert-g seqL))
(def subst (insert-g seqS))
(defn rember [old l] ((insert-g seqrem) false old l))