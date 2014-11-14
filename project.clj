(defproject gpu-genomics "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://github.com/dcunited001/gpu-genomics"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :resource-paths ["/opt/Aparapi_2012_01_23_MacOSX_zip/aparapi.jar"]
  :jvm-opts ["-Djava.library.path=/opt/Aparapi_2012_01_23_MacOSX_zip"]
  :main gpu-genomics.core
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [aparapi-matrix "0.1.0-SNAPSHOT"]])
