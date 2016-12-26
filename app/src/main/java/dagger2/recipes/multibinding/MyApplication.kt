package dagger2.recipes.multibinding

import android.app.Activity
import android.app.Application
import android.content.Context
import dagger2.recipes.multibinding.di.activity.ActivityComponentBuilder
import dagger2.recipes.multibinding.di.activity.HasActivitySubcomponentBuilders
import dagger2.recipes.multibinding.di.app.AppComponent
import dagger2.recipes.multibinding.di.app.DaggerAppComponent
import javax.inject.Inject
import javax.inject.Provider

class MyApplication : Application(), HasActivitySubcomponentBuilders {

  @Inject lateinit var activityComponentBuilders: Map<Class<out Activity>, @JvmSuppressWildcards Provider<ActivityComponentBuilder<*, *>>>

  private lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    onInitializeDagger()
  }

  private fun onInitializeDagger() {
    appComponent = DaggerAppComponent.create()
    appComponent.inject(this)
  }

  override fun getActivityComponentBuilder(activityClass: Class<out Activity>): ActivityComponentBuilder<*, *> {
    return activityComponentBuilders[activityClass]!!.get()
  }

  companion object {

    operator fun get(context: Context): HasActivitySubcomponentBuilders {
      return context.applicationContext as HasActivitySubcomponentBuilders
    }
  }

}

