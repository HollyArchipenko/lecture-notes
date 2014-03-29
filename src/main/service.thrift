service Subscription {
	string get(1: string userID, 2: string lectureID)
	void put(1: string userID, 2: string lectureID)
}