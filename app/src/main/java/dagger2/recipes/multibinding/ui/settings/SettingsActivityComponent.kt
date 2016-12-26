package dagger2.recipes.multibinding.ui.settings

import dagger.Module
import dagger.Subcomponent
import dagger2.recipes.multibinding.di.activity.ActivityComponent
import dagger2.recipes.multibinding.di.activity.ActivityComponentBuilder
import dagger2.recipes.multibinding.di.activity.ActivityModule
import dagger2.recipes.multibinding.di.activity.ActivityScope

@ActivityScope
@Subcomponent(modules = arrayOf(SettingsActivityComponent.SecondActivityModule::class))
interface SettingsActivityComponent : ActivityComponent<SettingsActivity> {

  @Subcomponent.Builder interface Builder : ActivityComponentBuilder<SecondActivityModule, SettingsActivityComponent>

  @Module class SecondActivityModule internal constructor(activity: SettingsActivity) : ActivityModule<SettingsActivity>(activity)
}