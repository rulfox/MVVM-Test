package `in`.arany.recyclerviewtest.viewmodels

import `in`.arany.recyclerviewtest.models.Product
import `in`.arany.recyclerviewtest.repositories.ProductRepository
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private var productRepository = ProductRepository(application)
    var products: LiveData<List<Product>> = productRepository.getAllProducts()
}