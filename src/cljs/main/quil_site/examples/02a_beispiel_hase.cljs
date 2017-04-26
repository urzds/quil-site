(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  (q/frame-rate 0)
  {:x 200
   :y 200
   :radius 70})

(defn malen [daten]
  (q/fill 0 0 255)
  ; Nase
  (q/ellipse (:x daten) (:y daten) (:radius daten) (:radius daten))
  ; Augen
  (q/rect 120 50 40 60)
  (q/rect 230 50 40 60)
  ; Mund
  (q/line 120 300 280 300)
  (q/line 120 280 280 280)
  (q/line 120 300 120 280)
  (q/line 280 300 280 280)
  ; Zähne
  (q/fill 30 255 255) ; Orange
  (q/rect 180 280 20 40)
  (q/fill 145 255 255) ; Blau
  (q/rect 200 280 20 40))

(q/defsketch my
  :host "host"
  :size [400 400]
  :setup start
  :draw malen
  :middleware [m/fun-mode])
