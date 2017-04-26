(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn kreis "Male Kreis bei x,y mit gg. Durchmesser" [x y durchmesser]
  (q/ellipse x y durchmesser durchmesser))

(defn quadrat "Male Quadrat bei x,y mit gg. Seitenlänge" [x y seitenlänge]
  (q/rect x y seitenlänge seitenlänge))

(defn dreieck "Male Dreieck zwischen drei (x,y)-Ecken" [x1 y1 x2 y2 x3 y3]
  (q/triangle
    x1 y1
    x2 y2
    x3 y3))

(defn malen [daten]
  (kreis 100 250 80)
  (quadrat 200 250 90)
  (dreieck 350 250 400 200 480 290))

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
