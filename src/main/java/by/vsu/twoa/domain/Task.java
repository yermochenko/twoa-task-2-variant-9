package by.vsu.twoa.domain;

import by.vsu.twoa.geometry.Circle;
import by.vsu.twoa.geometry.Point;
import by.vsu.twoa.geometry.Triangle;

import java.util.Date;

public class Task extends Entity {
	private User owner;
	private String name;
	private Date created;
	private Point vertex1;
	private Point vertex2;
	private Triangle triangleVariant1;
	private Circle circumCircleVariant1;
	private Triangle triangleVariant2;
	private Circle circumCircleVariant2;

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Point getVertex1() {
		return vertex1;
	}

	public void setVertex1(Point vertex1) {
		this.vertex1 = vertex1;
	}

	public Point getVertex2() {
		return vertex2;
	}

	public void setVertex2(Point vertex2) {
		this.vertex2 = vertex2;
	}

	public Triangle getTriangleVariant1() {
		return triangleVariant1;
	}

	public void setTriangleVariant1(Triangle triangleVariant1) {
		this.triangleVariant1 = triangleVariant1;
	}

	public Circle getCircumCircleVariant1() {
		return circumCircleVariant1;
	}

	public void setCircumCircleVariant1(Circle circumCircleVariant1) {
		this.circumCircleVariant1 = circumCircleVariant1;
	}

	public Triangle getTriangleVariant2() {
		return triangleVariant2;
	}

	public void setTriangleVariant2(Triangle triangleVariant2) {
		this.triangleVariant2 = triangleVariant2;
	}

	public Circle getCircumCircleVariant2() {
		return circumCircleVariant2;
	}

	public void setCircumCircleVariant2(Circle circumCircleVariant2) {
		this.circumCircleVariant2 = circumCircleVariant2;
	}
}
