package sem5_homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class User {  // MODEL PART of MVP

    private String name;
    private String login;
    private String password;
    private static File dataFile = new File("users_data.txt");

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveUserInfo() {
        // TODO: 11.08.2023
        /*
        public static void savePhonebookToFile(File dataFile, Map<String, List<String>> phonebook){
            if (!dataFile.exists()) {
                try {
                    dataFile.createNewFile();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            if(dataFile.canWrite()) {
                try (FileWriter fwriter = new FileWriter(dataFile, false)) {
                    for (var record: phonebook.entrySet()) {
                        String name = record.getKey();
                        List<String> phonesList = record.getValue();

                        for (int i = 0; i< phonesList.size(); i++){
                            fwriter.write(name + ":");
                            fwriter.write( phonesList.get(i)+ "\n");
                        }
                    }
                    fwriter.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
 */
    }

    public void loadUserInfo(){
        // TODO: 11.08.2023

    }
}
