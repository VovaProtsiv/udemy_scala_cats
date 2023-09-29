package fpfinal

import fpfinal.app.Configuration._
import fpfinal.app.Syntax._
import fpfinal.app.{App, AppState}

object Main {
  // commit we
  def main(args: Array[String]): Unit = {
    App
      //add 1
      .run()
      // commit 23
      .unsafeRunApp(liveEnv, AppState.empty)
    // todo
///34
    //2
    // something something
  }
}
