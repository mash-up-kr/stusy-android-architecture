package com.namget.myarchitecture.ui.base

import androidx.appcompat.app.AppCompatActivity
import com.namget.myarchitecture.data.repository.RepoRepository
import com.namget.myarchitecture.data.repository.RepoRepositoryImpl
import com.namget.myarchitecture.ext.setVisible
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_search.*

/**
 * Created by Namget on 2019.10.23.
 */
abstract class BaseActivity : AppCompatActivity() {

    open val disposable = CompositeDisposable()
    protected val repoRepository: RepoRepository by lazy { RepoRepositoryImpl }

    override fun onDestroy() {
        disposable.dispose()
        super.onDestroy()
    }


    protected fun showDialog() {
        progressBar.setVisible(isVisible = true)
    }

    protected fun hideDialog() {
        progressBar.setVisible(isVisible = false)
    }

}