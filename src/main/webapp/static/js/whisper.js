$(document).ready(function(){
    $("#exit").hover(function() {
            $("#exit").css("background-color","red");
        }
        ,function() {
            $("#exit").css("background-color","white");
        });
});

$(document).ready(function(){
    $.ajax({
        url:"../text/whisper.action",
        contentType:"application/json;charset=utf-8",
        data:{type:"design"},
        dataType:"json",
        type:"post",
        success:function (data) {
            $(data).each(function (i,n) {

                var datetime = new Date();
                datetime.setTime(n.whisperDate);
                var year = datetime.getFullYear();
                var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
                var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
                var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
                var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
                var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
                var day =year + "-" + month + "-" + date;
                var daytime = hour+":"+minute+":"+second

                $("#whisper").append('<div class="item-box">\n' +
                    '          <div class="item">\n' +
                    '            <div class="whisper-title">\n' +
                    '              <i class="layui-icon layui-icon-date"></i><span class="hour">'+daytime+'</span><span class="date">'+day +'</span>\n' +
                    '            </div>\n' +
                    '            <p class="text-cont">\n' +
                    '              '+n.whisperText +'\n' +
                    '            </p>\n' +
                    '            <div class="op-list">\n' +
                    '              <p class="">浏览数：<span>'+n.click +'</span></p> \n' +
                    '            </div>\n' +
                    '          </div>\n' +
                    '        </div>');

            });
        }
    });
});