var exec = require('cordova/exec');

var PluginAutoid9U = function (require, exports, module) {

    function EchoService() {

        this.singleTag = function (callback) {
            cordova.exec(callback, function(err) {
                callback('Algo deu errado! ' + err);
            }, "PluginAutoid9U", "singleTag", []);
        }

        this.open = function (callback) {
            cordova.exec(callback, function(err) {
                callback('Algo deu errado! ' + err);
            }, "PluginAutoid9U", "open", []);
        }

        this.close = function (callback) {
            cordova.exec(callback, function(err) {
                callback('Algo deu errado! ' + err);
            }, "PluginAutoid9U", "close", []);
        }

    }

    module.exports = new EchoService();
}

PluginAutoid9U(require, exports, module);

cordova.define("cordova/plugin/EchoService", PluginAutoid9U);
