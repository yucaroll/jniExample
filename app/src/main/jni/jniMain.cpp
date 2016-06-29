#include <com_example_ppang_jniexample_MainActivity.h>

JNIEXPORT jint JNICALL Java_com_example_ppang_jniexample_MainActivity_getJNIString(JNIEnv *env, jobject obj, jint a) {

    return a;
}

JNIEXPORT jint JNICALL Java_com_example_ppang_jniexample_MainActivity_getJNIString
  (JNIEnv *, jobject, jint);


