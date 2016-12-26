package dagger2.recipes.multibinding.ui.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import dagger2.recipes.multibinding.R
import dagger2.recipes.multibinding.di.activity.HasActivitySubcomponentBuilders
import dagger2.recipes.multibinding.ui.base.BaseActivity
import dagger2.recipes.multibinding.ui.settings.SettingsActivity

import javax.inject.Inject

class HomeActivity : BaseActivity() {

  @Inject lateinit internal var homeActivityPresenter: HomeActivityPresenter

  private var textView: TextView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    textView = findViewById(R.id.textView) as TextView
    (findViewById(R.id.button) as Button).setOnClickListener { openSecondScreen() }

    homeActivityPresenter.init()
  }

  override fun injectMembers(hasActivitySubcomponentBuilders: HasActivitySubcomponentBuilders) {
    (hasActivitySubcomponentBuilders.getActivityComponentBuilder(HomeActivity::class.java) as HomeActivityComponent.Builder).activityModule(
        HomeActivityComponent.MainActivityModule(this)).build().injectMembers(this)
  }

  fun openSecondScreen() {
    startActivity(Intent(this, SettingsActivity::class.java))
  }

  fun updateText(text: String) {
    textView!!.text = text
  }
}
