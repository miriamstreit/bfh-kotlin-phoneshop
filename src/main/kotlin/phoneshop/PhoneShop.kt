package phoneshop

class PhoneShop(private val owner: String) {
    var phoneStock : Int = 0
        private set
    var phonecaseStock : Int = 0
        private set

    fun getOwner() : String {
        return owner
    }

    fun fillStockPhones(num : Int) {
        phoneStock += num
    }

    fun fillStockCases(num : Int) {
        phonecaseStock += num
    }

    fun phoneSold() : String {
        return if (phoneStock > 0) {
            phoneStock--
            "OK"
        } else "NOK"
    }

    fun caseSold() : String {
        return if (phonecaseStock > 0) {
            phonecaseStock--
            "OK"
        } else "NOK"
    }
}