<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSON 객체</title>
    <script src="json_test.js"></script>
    <script>
        //JavaScript Object
       
        /* JavaScript를 JSON(String)으로 변환 */
        //저장하거나 데이터 보낼 때 JSON형식(문자열) 사용
        var json=JSON.stringify(obj);

        console.log(obj);
        console.log('type of obj: '+typeof(obj));
        console.log('type of jason: '+typeof(json));
        console.log(json);

        window.onload=function(){
            document.getElementById("json").innerHTML=json;
            //String JSON
            var newdate='{"memeberid":"cool","membername":"COOL","age":27,"programming":["JAVA","Python","JavaScript"]}';
            //JSON(String)->JavaScript Object
            var newObejct=JSON.parse(newdata);
        };
    </script>
</head>
<body>
    <h1 id="json">안녕하세요</h1>
</body>
</html>