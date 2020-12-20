package ru.suleymanovtat;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.suleymanovtat.model.TestBean;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        testBean.setAge(44);
        System.out.println(testBean.getAge());

        Music music = context.getBean("music", Music.class);
        Player player = new Player(music);
        player.playMusic();
        context.close();
    }
}
