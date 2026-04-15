package oop_126564_DimasPradhitya.Week08

class City(val name : String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDatails: DeliveryDetails?, val totalprice: Int?)