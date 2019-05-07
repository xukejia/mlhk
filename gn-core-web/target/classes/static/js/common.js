// check: pass - true, fail - false; ct 1 - val不为va 2 select.text
function microCheck(selObjs, msg, ct, va) {
    var eachFlag = false;
    if (!ct) ct = 1;
    if (!va) va = '';
    var blnCheck = true;
    $(selObjs).each(function () {
        switch (ct) {
            case 1:
                blnCheck = $(this).val() == va;
                break;
            case 2:
                blnCheck = $(this).find("option:selected").text() == va;
                break;
            default:
        }
        if (blnCheck) {
            alert(msg);
            $(this).focus();
            eachFlag = true;
            return false;
        }

    });
    return !eachFlag;
}
