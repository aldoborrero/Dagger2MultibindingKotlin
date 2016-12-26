package dagger2.recipes.multibinding.di.app

import dagger.Component
import dagger2.recipes.multibinding.MyApplication
import dagger2.recipes.multibinding.di.activity.ActivityBindingModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class, ActivityBindingModule::class))
interface AppComponent {
  fun inject(application: MyApplication): MyApplication
}