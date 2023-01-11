public class Book {
    private String name;
    private String author;
    
    private Module[] modules = new Module[10];

    public void setName(String name){
        this.name = name;
    }

    public void setAuthor(String name){
        this.author = name;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public void addModule(Module module){
        for(int i=0; i<this.modules.length;i++){
            if(this.modules[i] == null){
                this.modules[i] = module;
                return;
            }
        }
    }

    public Module[] getBookModules(){
        return this.modules;
    }

    public Module getSingleBookModule(int number){
        return modules[number];
    }
}
