package dev.valoy.workmanager

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class ExampleWorker @AssistedInject constructor(
  @Assisted appContext: Context,
  @Assisted workerParams: WorkerParameters,
  private val workerDependency: WorkerDependency
) : CoroutineWorker(appContext, workerParams) {

  override suspend fun doWork(): Result {
    Log.d("ExampleWorker", "Corrio el worker")
    return Result.success()
  }

}
