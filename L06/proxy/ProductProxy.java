package L06.proxy;

public class ProductProxy extends Product{
    private DbContext dbContext;
    public ProductProxy(int id,DbContext dbContext) {
        super(id);
        this.dbContext=dbContext;
    }
    public void setName(String name){
        super.setName(name);
        dbContext.markAsChanged(this);
    }

}
