package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;

import jakarta.persistence.*;

@Entity
public class UserLoanHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id = null;

  @JoinColumn(nullable = false)
  @ManyToOne
  private User users;

  private String bookName;

  private boolean isReturn;

  protected UserLoanHistory() {

  }

  public UserLoanHistory(User users, String bookName) {
    this.users = users;
    this.bookName = bookName;
    this.isReturn = false;
  }

  public void doReturn() {
    this.isReturn = true;
  }

  public String getBookName() {
    return this.bookName;
  }
}
