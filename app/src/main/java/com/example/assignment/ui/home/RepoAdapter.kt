package com.example.assignment.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment.data.model.Repository
import com.example.assignment.databinding.ItemRepoBinding

class RepoAdapter(private val repos: List<Repository>, private val onClick: (Repository) -> Unit) :
    RecyclerView.Adapter<RepoAdapter.RepoViewHolder>() {

    class RepoViewHolder(val binding: ItemRepoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(repo: Repository, onClick: (Repository) -> Unit) {
            binding.repoName.text = repo.name
            binding.repoDescription.text = repo.description
            binding.root.setOnClickListener { onClick(repo) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val binding = ItemRepoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RepoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        holder.bind(repos[position], onClick)
    }

    override fun getItemCount() = repos.size
}
