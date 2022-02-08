import telegram.handlers.CommandsHandler;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Bot {
    public static void main(String[] args){
        try{
            TelegramBotsApi tgBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            tgBotsApi.registerBot(new CommandsHandler());
        } catch (TelegramApiException ex){
            System.out.println(ex.getMessage());
        }
    }
}