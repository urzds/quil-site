(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn roter-hut "Male roten Hut bei x,y" [x y]
  (q/fill 0 255 255)
  (q/rect (- x 25)        y  50 40) ; Ein bisschen links von der Mitte beginnen
  (q/rect (- x 50) (+ y 40) 100  5)) ; Ein bisschen weiter links und unten den Rest

(defn malen [daten]
  (roter-hut 200 200))

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
