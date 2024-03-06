$(function() {
  $("#button_ajax_controller").on("click", function(e) {
	// AjaxでControllerのAPI実行
    e.preventDefault();  // デフォルトのイベント(ページの遷移やデータ送信など)を無効にする
    $.ajax({
      url: "/ajax",  // リクエストを送信するURLを指定（action属性のurlを抽出）
      type: "POST",  // HTTPメソッドを指定（デフォルトはGET）
    })
    .done(function(data) {
		$("#result_message").empty();
		console.log(data);
		console.log(data[0].id)
		$("#result_message").append(`<div>${data}</div>`);  // HTMLを追加
		$("#result_message").val("");  // 入力欄を空にする
    })
    .fail(function() {
      alert("error!");  // 通信に失敗した場合の処理
    })
  });
});
