package dagger2.recipes.multibinding.di.activity

import android.app.Activity

import dagger.MembersInjector

interface ActivityComponent<A : Activity> : MembersInjector<A>
