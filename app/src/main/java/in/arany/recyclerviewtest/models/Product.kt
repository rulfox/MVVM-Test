package `in`.arany.recyclerviewtest.models

import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("category_name")
    val categoryName: String,
    @SerializedName("pdt_mrp")
    val pdtMrp: String
) {
    companion object{
        fun getProducts() = listOf(
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand"),
            Product("Category","Brand")
        )
    }
}