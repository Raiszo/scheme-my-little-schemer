;   An S-expression is an atom if it is not
;   Null and is not a List.
;
;   The definition of nill in clojure is
;   different from the definition of NULL in
;   the 'little Schemer', where the empty
;   list is also a NULL element.

(def atom?
  (fn [x]
   (not (seq? x))))

(def null?
  (fn [x]
    (or
      (nil? x)
      ( = '() x))))
