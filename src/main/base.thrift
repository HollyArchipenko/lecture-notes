namespace java org.lecturenotes
namespace js org.lecturenotes

struct Subscribtion {
	1: string userID
	2: string lectureID
}

struct Lecture {
	1: string id
	2: string name
	3: i16 course
	4: i64 time //дата и время
}

typedef list<Lecture> lecturesList
