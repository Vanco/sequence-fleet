plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
     id = "van.studio.sequence"

    // STEP 2: set up the sensible metadata for your plugin
     metadata {
         readableName = "SequenceDiagram Fleet"
         description = "SeqencdeDiagram for Fleet"
     }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
