package com.example.fragmenthwmobilejava;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmenthwmobilejava.model.NameModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<NameModel> nameModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // отображаем кнопку "Назад"
            getSupportActionBar().setDisplayShowHomeEnabled(true); // для отображения значка в ActionBar
        }

        nameModels = new ArrayList<>();
        nameModels.add(new NameModel("Марія", "15 серпня", "Марія — это человек, обладающий яркой индивидуальностью, живым характером и непреклонной волей. Она всегда стремится к совершенству и не боится брать на себя ответственность. Марія обладает прекрасными организаторскими способностями и всегда поддерживает своих близких. В отношениях она верна и предана, но при этом имеет свою точку зрения, которой всегда придерживается. Она всегда готова помочь, но и ожидает взаимности в отношениях."));
        nameModels.add(new NameModel("Олександр", "5 липня", "Олександр — это человек, который всегда добивается своей цели, несмотря на трудности. Он отличается высоким уровнем ответственности и дисциплины, что делает его ценным сотрудником в любой команде. Олександр часто берет на себя лидерские роли и не боится принимать важные решения, даже если они связаны с риском. При этом он всегда справедлив и уважает мнения других. В личной жизни Олександр — верный и заботливый партнер. Семья для него на первом месте."));
        nameModels.add(new NameModel("Ірина", "8 марта", "Ірина — мягкий, но уверенный человек, умеющий создавать комфортную атмосферу вокруг себя. Она чувствительна и эмпатична, и всегда готова поддержать близких в трудные моменты. Ірина — творческая личность, она ищет новые способы самовыражения и любит создавать что-то необычное. В отношениях она требовательна, но искренне предана. Для Ірини важны честность и доверие."));
        nameModels.add(new NameModel("Дмитро", "19 грудня", "Дмитро — человек, который обладает сильным внутренним стержнем и не боится принимать на себя ответственность. Он умеет разбираться в сложных ситуациях и принимать взвешенные решения. В работе Дмитро строг, дисциплинирован, но всегда готов поддержать своих коллег. В личной жизни он также проявляет заботу и внимание к своим близким. Дмитро ценит стабильность и уверенность в будущем."));
        nameModels.add(new NameModel("Катерина", "25 листопада", "Катерина — это человек, который всегда стремится к гармонии в жизни. Она заботится о своем окружении и всегда готова прийти на помощь. Катерина умело сочетает умиротворенность и решительность, благодаря чему ей удается добиваться успеха во всех сферах жизни. В отношениях она всегда искренна и открыта, предпочитает стабильность и понимание."));
        nameModels.add(new NameModel("Артур", "3 лютого", "Артур — человек с глубоким внутренним миром, склонный к размышлениям и самоанализу. Он очень рассудителен и внимателен к деталям. Артур может показаться замкнутым, но на самом деле он ценит близкие отношения, доверие и искренность. В профессиональной жизни он проявляет инициативу и стремится к лидерству, но всегда готов выслушать мнение других."));
        nameModels.add(new NameModel("Анастасія", "4 червня", "Анастасія — человек с яркой индивидуальностью и сильным характером. Она всегда стремится к развитию и самоусовершенствованию, не боится бросать вызов себе. В отношениях Анастасія часто проявляет заботу и внимание к близким, она ценит стабильность и честность. Ее энергия и оптимизм вдохновляют окружающих на достижения."));
        nameModels.add(new NameModel("Володимир", "10 вересня", "Володимир — человек с харизмой и выдающимися лидерскими качествами. Он легко находит общий язык с людьми и умеет вести за собой команду. В работе Володимир отличается решительностью и настойчивостью. Он не боится трудностей и всегда стремится к победе. В личной жизни он заботлив и предан, ценит поддержку и уважение."));
        nameModels.add(new NameModel("Тетяна", "26 серпня", "Тетяна — это человек, обладающий невероятной терпимостью и пониманием. Она всегда готова выслушать и поддержать. Тетяна отличается добротой и стремится создавать гармонию в отношениях. В профессиональной сфере она демонстрирует высокую компетентность и преданность делу. В личной жизни она ценит искренность и доверие."));
        nameModels.add(new NameModel("Максим", "24 серпня", "Максим — это человек с высокой внутренней мотивацией и сильной волей. Он всегда стремится к успеху и не боится трудностей. Максим проявляет лидерские качества и умеет быть уверенным в себе. В отношениях он заботлив и верен, всегда поддерживает своих близких. Он ценит стабильность, честность и открытость."));


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new NameListFragment());
        transaction.commit();
    }

    public List<NameModel> getNameModels() {
        return nameModels;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
