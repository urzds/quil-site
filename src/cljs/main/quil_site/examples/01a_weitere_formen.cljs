(ns my.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]))

(defn start []
  (q/color-mode :hsb)
  {})

(defn malen [daten]
  ; Male Ellipse
  (q/ellipse
    100 250 ; Mitte (x, y)
    80      ; Breite
    80)     ; Höhe
  ; Male Rechteck
  (q/rect
    200 250 ; Linke obere Ecke (x, y)
    90      ; Breite
    50)     ; Höhe
  ; Male Dreieck
  (q/triangle
    350 250   ; Ecke 1 (x, y)
    400 200   ; Ecke 2 (x, y)
    480 290)) ; Ecke 3 (x, y)

(q/defsketch my
  :host "host"
  :size [500 500]
  :draw malen
  :setup start
  :middleware [m/fun-mode])
