package com.thedhobighat

/* Dependencies begin */

data class Serviceable(
    var item: String,
    var quantity: Int
)

/* Dependencies end */

data class LoginCredentials(
    var email: String,
    var password: String
)

data class CartInstance(
    var dry_wash: List<Serviceable>,
    var formal_wash: List<Serviceable>,
    var steam_iron: List<Serviceable>
)

data class PostOrderReq(
    var customer_name: String,
    var address: String,
    var phone: String
)

data class PostRegister(
    var email: String,
    var password: String,
    var name: String,
    var phone: String,
    var address: String
)