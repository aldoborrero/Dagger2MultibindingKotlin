package dagger2.recipes.multibinding.di.app

import dagger.Module
import dagger.Provides
import dagger.recipes.multibinding.helper.Utils
import javax.inject.Singleton

@Module
class AppModule {

  @Provides
  @Singleton
  fun provideUtils(): Utils {
    return Utils()
  }

}