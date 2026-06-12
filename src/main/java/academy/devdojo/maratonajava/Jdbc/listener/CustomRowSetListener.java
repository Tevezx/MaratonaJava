package academy.devdojo.maratonajava.Jdbc.listener;

import lombok.extern.log4j.Log4j2;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

// Essa classe serve para especificar o que esta acontecendo enquanto estamos executando o codigo do jdbcrowSet
@Log4j2
public class CustomRowSetListener implements RowSetListener {
    // Cada vez que tiver uma determinada ação, esses metodos serao acionados
    @Override
    public void rowSetChanged(RowSetEvent event) {
        log.info("Command execute triggered");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        log.info("Row inserted, updated or deleted");
        // verificando se quem gerou esse evento foi um rowset
        if (event.getSource() instanceof RowSet) {
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        log.info("Cursor moved");
    }
}
