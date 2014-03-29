namespace java org.lecturenotes
namespace js org.lecturenotes

typedef string userId
typedef list<byte> Image
typedef list<Image> Images

enum SEMESTER{
     AUTUMN
     SPRING
}

struct Holder {
  1: i32 id
  2: string title
  3: string name
  4: string organizationBelongs
}

struct Course {
  1: i32 id
  2: string subject
  3: i64 year
  4: Holder holder
  5: SEMESTER semester
  6: byte courseNumber
}

struct Subscription {
   1: string lecture
   2: i16 course
   3: i16 year
   4: string subject
   5: userId user
}

struct Lecture {
    1: Course course
    2: Images catalog
    3: string lectureId
}

struct Page{ 
    1: i32 id
    2: Image image
}

enum TYPE{
    ADMINISTRATOR
    USER
    GUEST
}

struct User {
    1: string id
    2: TYPE type
    3: string email
    4: string password
}

struct PasswordChange {
    1: string oldPass
    2: string newPass
}

struct ChangeUser {
    1: optional string email
    2: optional PasswordChange password
}

struct MissedLecture {
    1: Lecture lecture
    2: bool isViewed
}

typedef list<MissedLecture> MissedLectures

typedef string SessionHash

struct Credentials {
    1: string userId
    2: SessionHash hash
}