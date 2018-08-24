package service.reader_pack;

import domenObject.Student;

import java.util.List;

public interface ScriptReaderService {

    List<Student> readScriptAndFillCollection (List<Student> studList);
}
