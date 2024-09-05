module fleet.sample.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.kernel.plugins;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;
    requires fleet.dock.api;

    exports fleet.sample.frontendImpl;
    provides fleet.kernel.plugins.Plugin with fleet.sample.frontendImpl.MyPlugin;
}