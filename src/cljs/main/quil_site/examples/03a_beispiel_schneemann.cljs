(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn roter-hut "Male roten Hut" [x y]
  (q/fill 0 255 255) ; Hut ist rot
  (q/rect (- x 25)        y  50 40)
  (q/rect (- x 50) (+ y 40) 100  5))

(defn gesicht "Male weißes Gesicht mit Möhre" [x y]
  (q/fill 0 0 255) ; Gesicht ist weiß
  (q/ellipse         x        y 50 50)
  (q/fill 0 0 0) ; Augen sind schwarz
  (q/ellipse  (- x 10) (- y 10) 10 10)
  (q/ellipse  (+ x 10) (- y 10) 10 10)
  (q/fill 20 255 255) ; Möhre ist orange
  (q/triangle (- x 10)        y
                     x (+ y 10)
              (+ x 10)        y))

(defn jacke "Male Jacke mit Knöpfen" [x y]
  (q/fill 0 0 255) ; Jacke ist weiß
  (q/ellipse x        y 80 80)
  (q/fill 0 0 0) ; Knöpfe sind schwarz
  (q/ellipse x (- y 20) 10 10)
  (q/ellipse x (- y  5) 10 10)
  (q/ellipse x (+ y 10) 10 10))

(defn beine "Male Beine" [x y]
  (q/fill 0 0 255) ; Beine sind weiß
  (q/ellipse x y 100 100))

(defn boden "Male Boden" [] ; Boden ist immer unten, hat keine x,y Position
  (q/fill 0 0 255) ; Auf dem Boden liegt Schnee
  (q/rect -1 410 500 90))

(defn malen [daten]
  (roter-hut 250 160)
  (gesicht 250 230)
  (jacke 250 290)
  (beine 250 360)
  (boden))

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
