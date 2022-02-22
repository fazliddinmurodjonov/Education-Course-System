package com.example.room.entity

import androidx.room.Embedded
import androidx.room.Relation

data class CourseWithMentors(
    @Embedded val course: Course,
    @Relation(
        parentColumn = "courseId",
        entityColumn = "mentorCourseId"
    )
    val mentors : List<Mentor>
)