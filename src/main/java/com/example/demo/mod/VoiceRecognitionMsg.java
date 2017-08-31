package com.example.demo.mod;

/**
 * Created by wangjian on 2017/8/1.
 */
public class VoiceRecognitionMsg {
    private String callingNumber;
    private String calledNumber;
    private String resourceNumber;
    private String startTime;
    private String recognitionTime;
    private String resultMsgCode;
    @Override
    public String toString(){
        return callingNumber + "+" + calledNumber + "+" +  resourceNumber + "+" + startTime + "+" + recognitionTime + "+" + resultMsgCode;
    }

    //    CallResultMsg resultMsg = CallResultMsg.CODE_CALLED_BUSY;
//    private int resultMsg = CODE_CALLED_BUSY;

//    public static final int CODE_CALLED_BUSY = 01; //被叫忙
//    public static final int CODE_CLOSING_DOWN = 11; //停机
//    public static final int CODE_NULL_NUMBER = 06; //空号
//    public static final int CODE_CLOSED = 05; //关机
//    public static final int CODE_UNCONNECT = 03; //无法接通，不在服务区
//    public static final int CODE_ADD_ZERO = 18; //号码前面加0
//    public static final int CODE_ANSWER_VOICE = 15; //回铃声
//    public static final int CODE_NUMBER_OUT_TIME = 12; //号码过期
//    public static final int CODE_NOBODY_ANSWER = 04; //无人接听
//    public static final int CODE_CALLING_RESTRICTED = 20; //主叫限制
//    public static final int CODE_CALLED_RESTRICTED = 21; //被叫限制
//    public static final int CODE_ERR_TRANSFER = 22; //前传失败
//    public static final int CODE_CALLED_WAIT = 23; //被叫等待


//    public CallResultMsg getResultMsg() {
//        return resultMsg;
//    }
//
//    public void setResultMsg(CallResultMsg resultMsg) {
//        this.resultMsg = resultMsg;
//    }

    public String getCallingNumber() {
        return callingNumber;
    }

    public void setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    public String getResourceNumber() {
        return resourceNumber;
    }

    public void setResourceNumber(String resourceNumber) {
        this.resourceNumber = resourceNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getRecognitionTime() {
        return recognitionTime;
    }

    public void setRecognitionTime(String recognitionTime) {
        this.recognitionTime = recognitionTime;
    }

    public String getResultMsgCode() {
        return resultMsgCode;
    }

    public void setResultMsgCode(String resultMsgCode) {
        this.resultMsgCode = resultMsgCode;
    }
}
