
package com.zetcode
//ლუწი რიცხვების საშუალო
fun main() {
//    შევქმენით მთელი რიცხების მასივი და შევინახეთ nums ცვლადში
    val nums = arrayOf(1, 4, 9, 12, 13, 18, 30)
//    გამოვიძახეთ average ფუნქცია და გადავეცით პარამეტრად nums ცვლადში შენახული მთელი რიცხვების მასივი რაც შევინახეთ result -ში
    val result = average(nums)
    println(result)
}
//ვქმნით average ფუნქციას
fun average (nums: Array<Int>): Int{
    var emptyArray: Array<Int> = emptyArray()
    for(i in nums) {
//        ვამოწმებთ მასივის ელემენტის ინდექსს არის თუ არა ლუწი და ვამატებთ ცარიელ მასივში იმ რიცხვებს რომლის ინდექსიც ლუწია
        if(nums.indexOf(i) % 2 == 0 && nums.indexOf(i) != 0) {
            emptyArray += i
        }
    }
//    ცვლადში ვინახავთ nums მასივში ლუწ ინდექსზე მდგომი რიცხვების საშუალოს მთელი მნიშვნელობით
    val result = emptyArray.average().toInt()

//    ვაბრუნებთ დათვლილ მნიშვნელოას
    return result
}
