package com.project.hzwlcd.english_idioms_solitaire.display.activity;

import android.os.Bundle;

import com.project.hzwlcd.english_idioms_solitaire.R;
import com.project.hzwlcd.english_idioms_solitaire.base.App;
import com.project.hzwlcd.english_idioms_solitaire.base.BaseActivity;
import com.project.hzwlcd.english_idioms_solitaire.data.entity.Person;
import com.project.hzwlcd.english_idioms_solitaire.di.modules.ActivityModule;
import com.project.hzwlcd.english_idioms_solitaire.presenter.TestPresenter;
import com.project.hzwlcd.english_idioms_solitaire.view.TestView;

import javax.inject.Inject;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.display.activity.test/TestActivity
 * Created by HZW
 * Data 2017/10/16
 * Time 15:18
 */

public class TestActivity extends BaseActivity<TestView, TestPresenter, TestComponent> implements TestView {

    @Inject
    Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
    }

    @Override
    protected TestComponent initializeDi() {
        return App.getBaseApplication().getApplicationComponent().testComponent(new ActivityModule(this));
    }

    @Override
    protected void injectDependencies(TestComponent component) {
        component.inject(this);
    }
}
