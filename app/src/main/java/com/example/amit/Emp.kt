package com.example.amit

data class Emp (var Emp_name:String,var Emp_gender:String,var Emp_age:Int,var Emp_Address:String) {
    var id:Int=0
    constructor(id:Int,Emp_name:String,Emp_gender:String,Emp_age:Int,Emp_Address: String):this(Emp_name,Emp_gender,Emp_age,Emp_Address)
    {
        this.id=id
    }
}
