(ns Day01)

(def lines
  (map #(Integer/parseInt %)
       (clojure.string/split-lines (slurp "../Input/Day01.txt"))))

(defn larger-count [depths distance]
  (def currDepth (first depths))
  (def nextDepth (nth depths distance nil))
  (def remain (rest depths))
  (if (= nextDepth nil)
    0
    (+ (if
         (< currDepth nextDepth) 1 0)
       (larger-count remain distance))))

(defn part1 [depths]
  (larger-count depths 1))

(defn part2 [depths]
  (larger-count depths 3))

(println "Part1:" (part1 lines))
(println "Part2:" (part2 lines))