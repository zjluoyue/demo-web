<#include "base.ftl">
<#macro title>
    欢迎：${user.userName}
</#macro>

<#macro content>
<div class="text-xs-center">
    <h2>一个标题</h2>
    <p>by: ${user.userName}</p>
</div>
</#macro>