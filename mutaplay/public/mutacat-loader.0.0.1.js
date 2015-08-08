/**
 * Created by bjackman on 8/8/15.
 */

(function () {

  var sha256Url = location.origin + "/sha256";

  function scanPage() {
    var elems = document.getElementsByTagName("script");
    var len = elems.length;
    var i = 0;
    var elem = null;
    for (; i < len; i++) {
       elem = elems[i];
      if (elem.src.indexOf("sha256://") == 0) {
        var sha = elem.src.substr("sha256://".length);
        console.debug("Converting", elem);
        var n = document.createElement('script');
        n.src = convertSha256Url(sha);
        elem.parentNode.replaceChild(n, elem);
      }
    }
  }

  function convertSha256Url(sha) {
    return sha256Url + "/" + sha;
  }

  scanPage()
})();
