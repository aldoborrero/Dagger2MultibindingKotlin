package dagger2.recipes.multibinding.di.activity

import android.app.Activity

interface HasActivitySubcomponentBuilders {
  fun getActivityComponentBuilder(activityClass: Class<out Activity>): ActivityComponentBuilder<*, *>
}