package springopgave;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplication {
    public static void main (String[] args){
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);

        //Query q = new Query();
        //for (int i=0; i < q.filledArrayList("IT").size();i++) {
        //    System.out.println(q.filledArrayList("IT").get(i));
        //}

    }
}
