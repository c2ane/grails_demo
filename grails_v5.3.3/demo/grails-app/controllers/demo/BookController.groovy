package demo

class BookController {

    def index() {
        def book = new Book();
        bindData(book, params, [include: ['title']]);
              
        render "Hello World"
    }
}
