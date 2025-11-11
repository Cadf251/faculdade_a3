package helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class ValidarForm {
    /**
     * Verifica se todos os campos de um form estão preenchidos
     * 
     * @param campos
     * @return boolean true Se estiverem todos preenchidos, false se houber algum campo vazio
     */
    public static boolean camposPreenchidos(String[] campos){
        for(int i=0; i<campos.length;i++){
            if(campos[i].equals("")){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Transforma um String recebido de um campo formatado em Date no formato yyyy-MM-dd (Formato do banco de dados)
     * 
     * @param data A data em String recebida no formato dd/mm/yyyy
     * @return Date O object do Date
     * @throws ParseException Lança a ParseException se ocorrer algum erro.
     */
    public static Date formatarData(String dataStr) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(sdf.parse(dataStr).getTime());
        return data;
    }
    
}
