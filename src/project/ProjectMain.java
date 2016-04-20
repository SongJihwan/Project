package project;

import java.util.Scanner;

public class ProjectMain {
  Scanner keyScan = new Scanner(System.in);
  String id;
  String pw;
  String choice;
  
  public ProjectMain() {}
  
  public static void main(String[] args) {
    ProjectMain project = new ProjectMain();
    project.run();
  }
  
  public void run() {
    System.out.println("1. 로그인\n0. 종료");
    System.out.print("선택> ");
    String choice = keyScan.nextLine();
    
    while (true) {
      mainMenuChoice(choice);
    }
  }
  
  private void mainMenuChoice(String choice) {
    switch (choice) {
    case "1":
      login();
      break;
    case "0":
      System.out.println("시스템을 종료하겠습니다.");
      System.exit(0);
    default:
      System.out.println("잘못 입력하셨습니다.");
    }
  }

  private void login() {
    System.out.print("ID or Email : ");
    id = keyScan.nextLine();
    System.out.print("비밀번호 : ");
    pw = keyScan.nextLine();
    if (id.equalsIgnoreCase("admin")) {
      doAdmin();
    } else {
      doEmployee();
    }
  }

  private void doEmployee() {
    System.out.println("1. 개인정보수정\n2. 프로젝트 참가 현황\n3. 메인");
    System.out.print("선택> ");
    choice = keyScan.nextLine();
    
    while (true) {
      employeeMenuChoice(choice);
    }
  }

  private void employeeMenuChoice(String choice) {
    
  }

  private void doAdmin() {
    System.out.println("1. 사원 관리\n2. 자격증 관리\n3. 부서 관리\n4. PM 지정\n5. ADMIN 정보변경\n6. 메인");
    System.out.print("선택> ");
    choice = keyScan.nextLine();
    
    while (true) {
      adminMenuChoice(choice);
    }
  }

  private void adminMenuChoice(String choice) {
    
  }

}
