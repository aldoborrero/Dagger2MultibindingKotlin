package dagger2.recipes.multibinding.ui.settings

import dagger2.recipes.multibinding.di.activity.ActivityScope
import javax.inject.Inject

@ActivityScope
class SettingsActivityPresenter
@Inject
constructor(private val activity: SettingsActivity)
