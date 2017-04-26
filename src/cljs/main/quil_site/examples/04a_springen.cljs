(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  (q/frame-rate 50)
  {:farbe 80
   :durchmesser 100
   :x 250
   :y 250
   :zeit 0})

(defn malen [daten]
  (let [farbe (:farbe daten)
        durchmesser (:durchmesser daten)
        x (:x daten)
        y (:y daten)]
    (q/background 240)
    (q/fill farbe 255 255)
    (q/ellipse x y durchmesser durchmesser)))

(defn schritt [daten]
  (let [zeit (:zeit daten)
        xneu 250
        yneu (+ (* 200 (q/sin zeit)) 250)]
    (-> daten
        (assoc :zeit (+ zeit 0.05))
        (assoc :x xneu)
        (assoc :y yneu))))

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :update schritt
  :middleware [m/fun-mode])
