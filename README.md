### Simplified template - base off holdenk/sparkProjectTemplate.g8

```
git clone https://github.com/jayjayjohn/sparkProject

cd sparkProject

echo "test test world world count" > in.txt

sbt package  ## package is a generate a light jar,  use sbt assembly if you want all library to be included in jar, you will need 

spark-submit --class com.example.sparkProject.CountingApp \
            --name myapp \
            --master local[1] \
            ./target/scala-2.12/spark_example_app_2.12-0.1.jar \
            in.txt out.txt

```
