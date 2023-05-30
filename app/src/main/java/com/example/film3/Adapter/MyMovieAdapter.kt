package com.example.film3.Adapter

import android.content.Context
import com.example.film3.model.Movie
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.film3.R
import com.example.film3.databinding.ItemMovieBinding
import com.squareup.picasso.Picasso


class MyMovieAdapter():RecyclerView.Adapter<MyMovieAdapter.MyViewHolder>() {

    var movieList: List<Movie> = emptyList()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }

    class MyViewHolder(
        val binding: ItemMovieBinding
    ) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemMovieBinding = ItemMovieBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount() = movieList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie: Movie = movieList[position]
        with(holder.binding){
            movieNameTextView.text = movie.Title
            movieRateTextView.text = movie.IMDbRating
            movieDateComingTextView.text = movie.Year
            movieRatingCountTextView.text = movie.IMDbRatingCount
            if(movie.Image.isNotBlank()){
                Glide.with(posterImageView.context)
                    .load(movie.Image)
                    .circleCrop()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                    .into(posterImageView)
            }else{
                posterImageView.setImageResource(R.drawable.ic_launcher_background)
            }
        }
    }
}