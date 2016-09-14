;Here we use the first commandment
;of the little schemer.
;
;Instead of using 'null?',
;empty? is used.

;Also we use 'cond' as we would in
;Scheme.

(def lat?
  (fn [x]
    (cond
      (empty? x) true
      (seq? (first x)) false
      :else (lat? (rest x)))))
