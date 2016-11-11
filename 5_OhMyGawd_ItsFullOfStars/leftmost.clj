(defn leftmost [l]
  (if (seq? (first l))
    (leftmost (first l))
    (first l)))