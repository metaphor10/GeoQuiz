package com.absoftware.geoquiz;

public class TrueFalse {
	private int mQuestion;
	private boolean mTrueQuestion;
	public TrueFalse(int question, boolean trueQuestion )
	{
		mQuestion=question;
		mTrueQuestion=trueQuestion;
	}
	public int getQuestion() {
		return this.mQuestion;
	}
	public void setQuestion(int question) {
		this.mQuestion = question;
	}
	public boolean isTrueQuestion() {
		return this.mTrueQuestion;
	}
	public void setTrueQuestion(boolean trueQuestion) {
		this.mTrueQuestion = trueQuestion;
	}

}
