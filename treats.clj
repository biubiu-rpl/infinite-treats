(def treats
  ["apple"
   "dog biscuit"
   "bully stick"
   "celery"
   "carrot"
   "banana"
   "peanut butter"
   "dental chew"
   ])

(loop []
  (let [treat (rand-nth treats)]
    (println treat)
    (Thread/sleep 1000)
    (recur)
    ))
