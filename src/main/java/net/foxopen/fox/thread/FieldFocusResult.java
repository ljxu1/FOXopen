package net.foxopen.fox.thread;

import net.foxopen.fox.command.XDoResult;

/**
 * Evaluated data instructing an OutputGenerator to focus on a given element. See FocusCommand.
 */
public class FieldFocusResult
implements XDoResult, FocusResult {
  private final String mNodeRef;
  private final String mFocusStartPos;
  private final String mFocusEndPos;
  private final String mScrollYOffset;

  public FieldFocusResult(String pNodeRef, String pFocusStartPos, String pFocusEndPos, String pScrollYOffset) {
    mNodeRef = pNodeRef;
    mFocusStartPos = pFocusStartPos;
    mFocusEndPos = pFocusEndPos;
    mScrollYOffset = pScrollYOffset;
  }

  public String getNodeRef() {
    return mNodeRef;
  }

  public String getFocusStartPos() {
    return mFocusStartPos;
  }

  public String getFocusEndPos() {
    return mFocusEndPos;
  }

  public String getScrollYOffset() {
    return mScrollYOffset;
  }

  @Override
  public FocusType getFocusType() {
    return FocusType.FIELD;
  }
}