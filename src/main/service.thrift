include 'base.thrift'

service Subscript { 
    bool subscript(1: string userID, 2: Course lecture)
    bool unsubscript(1: string userID, 2: Course lecture)
}

service LectureNotes {
    string uploadLecture (1: Lecture lecture)
    bool removeLecture (1: Lecture lecture)
    Lecture downloadLecture (1: Course lectureId)
}

service GetSubscriptions {
    MissedLecture fetchAll(1: string userId)
    MissedLecture fetchUnviewed(1: string userId)
}

service User {
    string addNewUser (1: string name, 2: string email, 3: string password)
    User getProfile (1: string id)
    string changeProfile (1: string id, 2: changeUser data)
    SessionHash signIn (1: string name, 2: string password)
}
