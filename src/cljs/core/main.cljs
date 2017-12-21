(ns core.main)

(let [el (.createElement js/document "div")
      body (.-body js/document)]
 (.appendChild body el)
 (.create js/BalloonEditor el))
