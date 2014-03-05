namespace java org.lecturenotes
namespace js org.lecturenotes


struct Subscribtion{
   1: string UserId
   2: string LectureId
}

struct Lecture{
	1: i32 Id
	2: string name
	3: i16 course
	4: i64 time
}

struct Subject{
	1: string name
	2: i16 course
	3: SEMESTER semester
}

enum SEMESTER{
     AUTUMN
     SPRING
}