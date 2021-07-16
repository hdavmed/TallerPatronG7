package decorator;

public abstract class NotificacionDecorator {

	protected Notificacion notificacionDecoration;

    public NotificacionDecorator(Notificacion decoration) {
        notificacionDecoration = decoration;
    }
    
    public void sendNotification(Notificacion n) {
    	n.sendNotification("");
    }
}
