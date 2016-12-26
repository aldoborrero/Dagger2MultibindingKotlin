package dagger2.recipes.multibinding.ui.settings

import android.os.Bundle
import dagger2.recipes.multibinding.R
import dagger2.recipes.multibinding.di.activity.HasActivitySubcomponentBuilders
import dagger2.recipes.multibinding.ui.base.BaseActivity

import javax.inject.Inject

class SettingsActivity : BaseActivity() {

  @Inject internal lateinit var presenter: SettingsActivityPresenter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
  }

  override fun injectMembers(hasActivitySubcomponentBuilders: HasActivitySubcomponentBuilders) {
    (hasActivitySubcomponentBuilders.getActivityComponentBuilder(SettingsActivity::class.java) as SettingsActivityComponent.Builder).activityModule(
        SettingsActivityComponent.SecondActivityModule(this)).build().injectMembers(this)
  }

}
