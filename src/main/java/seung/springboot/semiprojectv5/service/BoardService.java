package seung.springboot.semiprojectv5.service;


import seung.springboot.semiprojectv5.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> readBoard(int cpage);
    List<Board> readBoard(int cpage, String ftype, String fkey);


    int countBoard();
    int countBoard(String ftype, String fkey);

    boolean newBoard(Board bd);

    Board readOneBoard(String bno);
}
