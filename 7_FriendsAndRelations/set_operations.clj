(defn intersect? [set1 set2]
  (cond
    (empty? set1) false
    (member? (first set1) set2) true
    :else (intersect? (rest set1) set2)))

(defn intersect [set1 set2]
  (when (seq set1)
    (if (member? (first set1) set2)
      (cons (first set1) (intersect (rest set1) set2))
      (intersect (rest set1) set2))))

(defn union [set1 set2]
  (cond
    (empty? set1) set2
    (member? (first set1) set2) (union (rest set1) set2)
    :else (cons (first set1) (union (rest set1) set2))))

(defn difference [set1 set2]
  (cond
    (empty? set1) set2
    (member? (first set1) set2)
      (difference (rest set1) (rember (first set1) set2))
    :else
      (cons (first set1) (difference (rest set1) set2))))

(defn intersect-all [l-list]
  (if (empty? (rest l-list))
    (first l-list)
    (intersect (first l-list) (intersect-all (rest l-list)))))