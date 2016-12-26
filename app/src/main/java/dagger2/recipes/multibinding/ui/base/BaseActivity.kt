package dagger2.recipes.multibinding.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger2.recipes.multibinding.MyApplication
import dagger2.recipes.multibinding.di.activity.HasActivitySubcomponentBuilders

abstract class BaseActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setupActivityComponent()
  }

  protected fun setupActivityComponent() {
    injectMembers(MyApplication[this])
  }

  protected abstract fun injectMembers(hasActivitySubcomponentBuilders: HasActivitySubcomponentBuilders)
}
