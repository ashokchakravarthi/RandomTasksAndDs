public final class MyImmutableQueue<T> implements Queue<T>
{
    private final Stack<T> backwards;
    private final Stack<T> forwards;
    private MyImmutableQueue(Stack<T> forwards, Stack<T> backwards)
    {
        this.forwards = forwards;
        this.backwards = backwards;
    }

    public final static Stack reverseStack(Stack stack) throws Exception
    {
        Stack r = ImmutableStack.getEmptyStack();
        while(!stack.isEmpty()){
            r = r.push(stack.head());
            stack = stack.pop();
        }

        return r;
    }

    public final static Queue getEmptyQueue(){
        return EmptyQueue.getInstance();
    }

    public final Queue<T> enQueue(T t){
        return new MyImmutableQueue<T>(forwards, backwards.push(t));
    }

    public final Queue<T> deQueue() throws Exception{
        Stack<T> f = forwards.pop();
        if (!f.isEmpty()){
            return new MyImmutableQueue<T>(f, backwards);
        }
        else if (backwards.isEmpty()){
            return MyImmutableQueue.getEmptyQueue();
        }
        else {
            return new MyImmutableQueue<T>(MyImmutableQueue.reverseStack(backwards), ImmutableStack.getEmptyStack());
        }
    }

    public final T head() throws Exception{
        return forwards.head();
    }

    public final boolean isEmpty(){
        return false;
    }

    private static final class EmptyQueue<T> implements Queue<T>{

        private final static EmptyQueue emptyQueue = new EmptyQueue();
        public final static EmptyQueue getInstance(){
            return emptyQueue;
        }
        public final Queue<T> enQueue(T t){
            return new MyImmutableQueue<T>(ImmutableStack.getEmptyStack().push(t), ImmutableStack.getEmptyStack());
        }
        public final Queue<T> deQueue() throws Exception{
            throw new Exception("Queue is empty.");
        }
        public final T head() throws Exception{
            throw new Exception("Queue is empty.");
        }
        public final boolean isEmpty(){
            return true;
        }
    }
}

interface Stack<T>
{
    public Stack<T> push(T t);
    public Stack<T> pop() throws Exception;
    public T head() throws Exception;
    public boolean isEmpty();
}

interface Queue<T>
{
    public Queue<T> enQueue(T t);
    public Queue<T> deQueue() throws Exception;
    public T head() throws Exception;
    public boolean isEmpty();
}

final class ImmutableStack<T> implements Stack<T>{
    private final T head;
    private final Stack<T> tail;

    private ImmutableStack(T head, Stack<T> tail){
        this.head = head;
        this.tail = tail;
    }

    public final Stack<T> push(T t){
        return new ImmutableStack<T>(t, this);
    }

    public final Stack<T> pop()
    {
        return tail;
    }

    public final T head()
    {
        return head;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final static Stack getEmptyStack()
    {
        return EmptyStack.getInstance();
    }

    private static final class EmptyStack<T> implements Stack<T>{
        private final static EmptyStack emptyStack = new EmptyStack();
        public final static EmptyStack getInstance(){
            return emptyStack;
        }
        public final Stack<T> push(T t){
            return new ImmutableStack<T>(t, this);
        }
        public final Stack<T> pop() throws Exception{
            throw new Exception("Stack is empty.");
        }
        public final T head() throws Exception{
            throw new Exception("Stack is empty.");
        }
        public final boolean isEmpty(){
            return true;
        }
    }
}