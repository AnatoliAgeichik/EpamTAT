<table class="table table-striped table-bordered">
<thead>
<tr>
<th>Test Case ID</th>
<th>Test Scenario</th>
<th style="width: 1000px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Test&nbsp;Steps&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Test Data</th>
<th>Expected Results</th>
<th>Actual Results</th>
<th>Pass/Fail</th>
</tr>
</thead>
<tbody>

<tr>
<td>TU01</td>
<td>Check Customer Login with valid Data</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Enter PhoneNumber <br/>3.Enter Password <br/>4. Click “Войти”</td>
<td>Phone number=+375297653*** Password afafqeqe</td>
<td>User should Login into an application</td>
<td>As expected</td>
<td>Pass</td>
</tr>

<tr>
<td>TU02</td>
<td>adding a product to your favorites</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Login  <br/>3. choose product <br/>4. Click icon heart&quot;В избранное&quot;<br/>5 go to Избранное and see new product</td>
<td>product =https://shop.by/velosipedy/stream_alina_28_2020/#desc</td>
<td>Icon “В избранное” should change the color to red and on top page count favorite products should increase by one The product the product must be added to favorites and product should added to Избранное</td>
<td>As expected</td>
<td>Pass</td>
</tr>

<td>TU03</td>
<td>ability to apply filters to search for products</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Login  <br/>3. choose section <br/>4. select a filter <br/>5.Click “Посмотреть”</td>
<td>product section =https://shop.by/velosipedy/    Filters: Производитель: Stels Тип: Горный Назначение:Женский Материал рамы: Сталь Вилка: Двухкорная</td>
<td>The user should see list with product. In our case this one product (Велосипед Stels Miss 5000 MD 26 V010 (2019)) search page <a href="https://shop.by/velosipedy/?data_mode=1&amp;prof_1150=-1&amp;mode=find&amp;essense_id=1632&amp;page_size=48&amp;prof_1000=6279&amp;prof_56=7840&amp;prof_1234=12238&amp;prof_3325=1162&amp;prof_3328=8130">https://shop.by/velosipedy/?data_mode=1&amp;prof_1150=-1&amp;mode=find&amp;essense_id=1632&amp;page_size=48&amp;prof_1000=6279&amp;prof_56=7840&amp;prof_1234=12238&amp;prof_3325=1162&amp;prof_3328=8130</a></td>
<td>As expected</td>
<td>Pass</td>
</tr>

<tr>
<td>TU04</td>
<td>Order registration</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2. go to order page <br/>3. choose “Самовывоз”, способ оплаты  “Банковская карточка” <br/>4.</td>
<td>order page = <a href="https://shop.by/shcart/?good_id=634970087">https://shop.by/shcart/?good_id=634970087</a></td>
<td>The order gets the status “Оформлен, ожидает подтверждения”</td>
<td>As expected</td>
<td>Pass</td>
</tr>
<tr>
<td>TU05</td>
<td>Adding to product comparison</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2. go to product1 page <br/>3.click button “сравнить” <br/>4. go to product2 page <br/>5. click button “сравнить” <br/>6.go to page “сравнить товары”</td>
<td>product1 = <a href="https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#desc">https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#desc</a>          product 2= <a href="https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#desc">https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#desc</a></td>
<td>changes the icon, and we have to see page in <a href="https://shop.by/list/apple_iphone_11_64gb_black+huawei_p30_pro_8gb_256gb_black_vog_l29/?ess_id=926">https://shop.by/list/apple_iphone_11_64gb_black+huawei_p30_pro_8gb_256gb_black_vog_l29/?ess_id=926</a></td>
<td>As expected</td>
<td>Pass</td>
</tr>


<tr>
<td>TU06</td>
<td>Check ability to go to the seller’s website</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Login <br/>3. choose product <br/>4. in line <a href="http://amb.by">amb.by</a> we click “В магазин”</td>
<td>product <a href="https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#reviews">https://shop.by/telefony_mobilnye/apple_iphone_11_64gb_black/#reviews</a></td>
<td>we should go over on page <a href="https://www.amd.by/catalog/telefony-racii/mobilnye-telefony/apple-iphone-11-64gb-chernyi/">https://www.amd.by/catalog/telefony-racii/mobilnye-telefony/apple-iphone-11-64gb-chernyi/</a></td>
<td>As expected</td>
<td>Pass</td>
</tr>
<tr>

<tr>
<td>TU07</td>
<td>checking whether an item was added to the viewed list</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.go to product page  <br/>3. click on logo icon(<a href="http://shop.by">shop.by</a>)</td>
<td>product page = <a href="https://shop.by/opriskivateli/patriot_pt_12ac/#shop">https://shop.by/opriskivateli/patriot_pt_12ac/#shop</a></td>
<td>in section &quot;Вы смотрели&quot;our product should be added in the left part</td>
<td>As expected</td>
<td>Pass</td>
</tr>
<tr>
<td>TU08</td>
<td>Sharing product in social media</td>
<td>1.Go to product page <br/>2.Click on icon sharing in social media(three points) <br/>3.click on Telegram icon <br/>4. sending to your account</td>
<td>product page = <a href="https://shop.by/basseyny_j/intex_56996_metal_frame_pool_366_x_76/#shop">https://shop.by/basseyny_j/intex_56996_metal_frame_pool_366_x_76/#shop</a></td>
<td>the user should receive a link to the product in their messages</td>
<td>As expected</td>
<td>Pass</td>
</tr>
<tr>

<td>TU09</td>
<td>Check for customer personal data editing</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Login  <br/>3. Click “Настройки” <br/>4. Enter new Username</td>
<td>Username=Superman</td>
<td>Data changed</td>
<td>As expected</td>
<td>Pass</td>
</tr>

<tr>
<td>TU10</td>
<td>Check result search line with valid data</td>
<td>1.Go to site <a href="http://shop.by">shop.by</a> <br/>2.Login  <br/>3. write search term</td>
<td>search term = Велосипед</td>
<td>we should go over on this link = <a href="https://shop.by/find/?findtext=%D0%92%D0%B5%D0%BB%D0%BE%D1%81%D0%B8%D0%BF%D0%B5%D0%B4">https://shop.by/find/?findtext=Велосипед</a></td>
<td>As expected</td>
<td>Pass</td>
</tr>

</tbody>
</table>
