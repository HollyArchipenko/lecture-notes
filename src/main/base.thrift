namespace java org.lecturenotes
namespace js org.lecturenotes

struct Subscribtion {
	1: i32 idUser
	2: i32 idLecture
}

struct Lecture {
	1: i32 id
	2: string name
	3: i16 course
	4: i64 time //дата и время
}

typedef list<Lecture> lecturesList
