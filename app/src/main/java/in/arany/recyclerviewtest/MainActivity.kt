package `in`.arany.recyclerviewtest

import `in`.arany.recyclerviewtest.models.Product
import `in`.arany.recyclerviewtest.viewmodels.MainActivityViewModel
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var productViewModel: MainActivityViewModel
    private lateinit var productAdapter: ProductAdapter
    private val adapter: ProductAdapter? = null
    private var products: MutableList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        productViewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        initRecyclerView()
        productViewModel.products.observe(this, Observer {
            products.addAll(it)
            productAdapter.notifyDataSetChanged()
        })
    }

    fun initRecyclerView() {
        productAdapter = ProductAdapter(products)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapter
        recyclerView.setHasFixedSize(true)
    }
}
