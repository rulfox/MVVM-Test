package `in`.arany.recyclerviewtest.repositories

import `in`.arany.recyclerviewtest.R
import `in`.arany.recyclerviewtest.models.Product
import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ProductRepository(val application: Application) {

    private val TAG = "POTTAL"

    var products: MutableLiveData<List<Product>> = MutableLiveData()

    fun getAllProducts(): LiveData<List<Product>> {
        val productResponse: String = application.applicationContext.resources.getString(R.string.responseJson).trim()
        Log.d(TAG, productResponse)
        products.postValue(Product.getProducts())
        return products
    }
}