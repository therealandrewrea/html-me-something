class Post: #superclass doesn't require "self" arg, but it is included in the constructor
    def __init__(self, title, author, body):
        self.title = title
        self.author = author
        self.body = body
        self.likes = 0

    def like(self):
        self.likes += 1

    def __str__(self):
        return self.title+" by "+self.author+"Here's the body: "+self.body

class VideoPost(Post):
    def __init__(self, title, author, url):
        super().__init__(title, author, None)
        self.video_url = url
        self.plays = 0

    def plays(self):
        self.plays += 1

    def __str__(self):
        return self.title+" by "+self.author+" viewed here: "+self.video_url

post = Post("Here's your Post, you dick", "You Dick", "This is a test post for checking out if this works in Terminal.  I hope it does!")
vid_post = VideoPost("Vidjo Poost", "Anton van Anton", "VIDEO NOISES")

print(post)
print(vid_post)
