enum ChannelType {WhatsApp, Telegram}

public interface IChannel {
   void send(string text);
}

public class WhatsApp: IChannel{
    void send(string text){
        //do something
    }
}

public class Telegram: IChannel{
    void send(string text){
        //do something
    }
}

public static class Factory  
{  
  
    public static IChannel GetChannel(ChanelType type)  
    {  
        IChannel factory = channelFactories[id];  
        return factory;  
    }  
     
  
    public static  Dictionary<ChannelType, IChannel> channelFactories =  
        new Dictionary<ChannelType, IChannel>  
        {  
            { ChannelType.WhatsApp, new WhatsApp() },  
            { ChannelType.Telegram, new Telegram() }
  
        };  
          
}  

public static class SendMessage{
    public static void SendMessage(Json obj) {
        IChannel channel = Factory.GetChannel(obj.type);
        chanel.send(obj.text);
    }
}




















