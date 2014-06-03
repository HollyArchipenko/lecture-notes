package org.bsu.lecture.rest.entities

/**
 * Created by Admin on 02.06.14.
 */
class Course(_subject: String, _year: Long, _isAutumn: Boolean, _courseNumber: Short, _university: String, _holderId: String) {
  var subject: String = _subject
  var year: Long = _year
  var holderId: String = _holderId
  var isAutumn: Boolean = _isAutumn
  var courseNumber: Short =_courseNumber
  var university: String =_university
}
