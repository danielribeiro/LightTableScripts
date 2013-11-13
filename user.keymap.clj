{:+ {:app {}

     :editor {"alt-w" [:editor.watch.watch-selection]
              "alt-shift-w" [:editor.watch.unwatch]
              }

     :editor.clj {"pmeta-i" [(:eval.custom "(str (type '__SELECTION*__ ) '__SELECTION*__ )"
                                           {:result-type :replace})]}
     


     }

 }
