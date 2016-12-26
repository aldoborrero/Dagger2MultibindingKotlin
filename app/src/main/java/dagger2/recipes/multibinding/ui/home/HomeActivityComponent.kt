package dagger2.recipes.multibinding.ui.home

import dagger.Module
import dagger.Subcomponent
import dagger2.recipes.multibinding.di.activity.ActivityComponent
import dagger2.recipes.multibinding.di.activity.ActivityComponentBuilder
import dagger2.recipes.multibinding.di.activity.ActivityModule
import dagger2.recipes.multibinding.di.activity.ActivityScope

@ActivityScope
@Subcomponent(modules = arrayOf(HomeActivityComponent.MainActivityModule::class))
interface HomeActivityComponent : ActivityComponent<HomeActivity> {

  @Subcomponent.Builder
  interface Builder : ActivityComponentBuilder<MainActivityModule, HomeActivityComponent>

  @Module
  class MainActivityModule internal constructor(activity: HomeActivity) : ActivityModule<HomeActivity>(activity)
}
