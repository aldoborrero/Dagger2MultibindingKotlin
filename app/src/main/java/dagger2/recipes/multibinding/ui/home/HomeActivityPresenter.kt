package dagger2.recipes.multibinding.ui.home

import dagger.recipes.multibinding.helper.Utils
import dagger2.recipes.multibinding.di.activity.ActivityScope
import javax.inject.Inject

@ActivityScope
class HomeActivityPresenter
@Inject
constructor(private val activity: HomeActivity, private val utils: Utils) {

  fun init() {
    activity.updateText(utils.hardcodedText)
  }
}
