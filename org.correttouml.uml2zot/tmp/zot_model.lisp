(asdf:operate 'asdf:load-op 'ae2zot)
(use-package :trio-utils)
(defvar TSPACE 100)
(defvar AX1 
 (&& 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; CLASS DIAGRAM 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;SIGNALS SEMANTICS

;;org.correttouml.uml.diagrams.classdiagram.Object@6f991ccfSEMANTICS

;;org.correttouml.uml.diagrams.classdiagram.Object@6f991ccf STD org.correttouml.uml.diagrams.statediagram.StateDiagram@57c63b SEMANTICS

;;STATE org.correttouml.uml.diagrams.statediagram.State@7113bc51
(-> (-P- MADESYSTEMSTART) (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1)))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_ENTER) (yesterday (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_XecLYIJ6EeKEaPZA9p6rmQ)))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_EXIT) (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_Y0le8IJ6EeKEaPZA9p6rmQ))
(-> (&&  (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1) (!! (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_EXIT))) (next (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1)))
(-> (&&  (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1) (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_EXIT)) (next (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1))))
(-> (&&  (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1)) (next (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_ENTER))) (next (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1)))
(-> (&&  (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1)) (next (!! (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_ENTER)))) (next (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1))))

;;STATE org.correttouml.uml.diagrams.statediagram.State@119f4b78
(-> (-P- MADESYSTEMSTART) (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0)))
(-> (-P- MADESYSTEMSTART) (next (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_ENTER)))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_ENTER) (yesterday (||  (-P- MADESYSTEMSTART) (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_Y0le8IJ6EeKEaPZA9p6rmQ))))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_EXIT) (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_XecLYIJ6EeKEaPZA9p6rmQ))
(-> (&&  (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0) (!! (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_EXIT))) (next (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0)))
(-> (&&  (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0) (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_EXIT)) (next (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0))))
(-> (&&  (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0)) (next (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_ENTER))) (next (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0)))
(-> (&&  (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0)) (next (!! (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_ENTER)))) (next (!! (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0))))

;;TRANSITION org.correttouml.uml.diagrams.statediagram.Transition@4da87e3f
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_Y0le8IJ6EeKEaPZA9p6rmQ) (&&  (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_EXIT) (next (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_ENTER))))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_Y0le8IJ6EeKEaPZA9p6rmQ) (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState1))

;;TRANSITION org.correttouml.uml.diagrams.statediagram.Transition@6a5c3cfe
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_XecLYIJ6EeKEaPZA9p6rmQ) (&&  (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState0_EXIT) (next (-P- OBJInstanceSpecification1_STDStateMachine1_STATEState1_ENTER))))
(-> (-P- OBJInstanceSpecification1_STDStateMachine1_TRANSITION_XecLYIJ6EeKEaPZA9p6rmQ) (-P- $OBJInstanceSpecification1_STDStateMachine1_STATEState0))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SEQUENCE DIAGRAMS 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; IODs 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


)) ;;END AX1 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; INIT AXIOM
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defvar initAx (&& 
(yesterday (&&  (-P- MADESYSTEMSTART) (alwf_e (!! (-P- MADESYSTEMSTART)))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; CLASS DIAGRAM INITIALIZATION 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;org.correttouml.uml.diagrams.classdiagram.Object@6f991ccf INITIALIZATION SEMANTICS

) )


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; THE SYSTEM
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defvar the_system  (&& (yesterday (alwf AX1)) initAx ))


(ae2zot:zot TSPACE (&& the_system) :smt-solver :z3 :logic :QF_UFLIA  )