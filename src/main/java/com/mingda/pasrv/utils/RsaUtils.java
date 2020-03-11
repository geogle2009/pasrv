package com.mingda.pasrv.utils;
/**
 * 客户端  发送用户名 和 公钥加密过的密码
 * 服务端  解密 用户名和密码  获取用户信息 反馈 accesstoken
 * @author wangj
 *
 */
public class RsaUtils {	
	public static final String pubkey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCs+LbpFapuUOZt1lJn435q6rPscDLh1vUHT7GmpGUZg0LQhX3+YCOLwPwsWuPOA0i+JVpu57lJYFAjfDgPenAvhBddGpvOy/PsiCapYTf5/uwcb6UFZMr27nxBTpbicXdFBwK+rhdjM+w0JuzdN1Aez4nwNVNY1uXMcARUJ37AJQIDAQAB";
	public static final String prikey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAKz4tukVqm5Q5m3WUmfjfmrqs+xwMuHW9QdPsaakZRmDQtCFff5gI4vA/Cxa484DSL4lWm7nuUlgUCN8OA96cC+EF10am87L8+yIJqlhN/n+7BxvpQVkyvbufEFOluJxd0UHAr6uF2Mz7DQm7N03UB7PifA1U1jW5cxwBFQnfsAlAgMBAAECgYEAkxJ3FADkBSCsjT/qmYMJfodJrQRJf1VyymCswPCPNf4x1XNsCdpc3vucb2powEZyl5rTJfHJzeYivcllMWP99j4b7dJD49qvOKhEM/FgQOrM94MyzIpmkqNK1GK+vrvg3PVfYWLQaZSBUAoZRgjbEiUu86eHKDJZJBB1vSrs4wECQQD4jqwNcRuSikExiXJkfom+r9RTeLC+kYW9g9v8yV+tzNVPeNiGwHoU7n7kT3h2It4qA+Kw3/Lzs5xmKy/YSWdRAkEAsiai1iPtiexraNuZ760iW7MJduxKXxgHgC8HqrFesrAcXseYC1zOvzNYjfhM6SiSN70asz4EIxpE3qyNscA+lQJBAJPtdYBafKpuFfbBco9Ur+4I/zjeb3I7cXkk7Nw5jPQHIDy4E0W/b+jdOC/xDCRjBA3FWjkiT5myn7Y+pa73oMECQQCRXuGlZ+/fiiIjkH7OizLsLO5eMnaFnnAQc1AIQ3AI05hy5t/09ahncRij0KfB4q9d+FufQ83QbxEfuyJsl3j5AkAJ5/GIcSMbW+kBiwuitDA0L1I4ZnanDBqTpaGlOv7ncHJmTWOO5vfji//32/5/yA5EJVNBjMcQ0RjRbmUhLnUy";
}
