package dagger2.recipes.multibinding.di.activity

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module abstract class ActivityModule<out T : Activity>(protected val activity: T) {

  @Provides @ActivityScope fun provideActivity(): T {
    return activity
  }
}
