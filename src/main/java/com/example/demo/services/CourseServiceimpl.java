package com.example.demo.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.entities.Course;
@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
    
//	List<Course>list;
	public CourseServiceimpl() {
//		list=new ArrayList<>();
//		list.add(new Course(145,"Java Core Course","this course contains basics of java"));
//		list.add(new Course(146,"Spring Boot Course","Creating rest apis using spring boot"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		
		return courseDao.findAll();    
	}
	
	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getById(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getById(parseLong);
		courseDao.delete(entity);
	}

}
