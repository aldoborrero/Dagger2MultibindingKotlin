package dagger2.recipes.multibinding.di.activity

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger2.recipes.multibinding.ui.home.HomeActivity
import dagger2.recipes.multibinding.ui.home.HomeActivityComponent
import dagger2.recipes.multibinding.ui.settings.SettingsActivity
import dagger2.recipes.multibinding.ui.settings.SettingsActivityComponent

@Module(subcomponents = arrayOf(HomeActivityComponent::class, SettingsActivityComponent::class))
abstract class ActivityBindingModule {

  @Binds
  @IntoMap
  @ActivityKey(HomeActivity::class)
  abstract fun mainActivityComponentBuilder(impl: HomeActivityComponent.Builder): ActivityComponentBuilder<*, *>

  @Binds
  @IntoMap
  @ActivityKey(SettingsActivity::class)
  abstract fun secondActivityComponentBuilder(impl: SettingsActivityComponent.Builder): ActivityComponentBuilder<*, *>
}