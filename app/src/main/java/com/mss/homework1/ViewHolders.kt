package com.mss.homework1

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.project_info.view.*
import kotlinx.android.synthetic.main.skill_item.view.*
import kotlinx.android.synthetic.main.user_info.view.*

class UserHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    lateinit var userInfo: User

    fun bind(userInfo: User) {
        view.apply {
            uName.text = userInfo.name
            uGrade.text = userInfo.grade
            uGitHub.setOnClickListener {
                view.context.startActivity(
                    Intent(Intent.ACTION_VIEW, Uri.parse(userInfo.link))
                )
            }
        }

        this.userInfo = userInfo
    }
}

class ProjectHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    lateinit var projectInfo: Project

    fun bind(projectInfo: Project) {
        view.apply {
            tv_project_info.text = projectInfo.info
        }

        this.projectInfo = projectInfo
    }
}

class SkillsHeaderHolder(val view: View) : RecyclerView.ViewHolder(view)

class SkillHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    lateinit var skillInfo: Skill

    fun bind(skillInfo: Skill) {
        view.apply {
            skillName.text = skillInfo.name
            skillExperience.text = experienceToRussian(skillInfo.experience)
        }

        this.skillInfo = skillInfo
    }
}
