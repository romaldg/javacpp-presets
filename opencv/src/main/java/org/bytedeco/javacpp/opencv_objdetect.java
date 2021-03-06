// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_ml.*;

public class opencv_objdetect extends org.bytedeco.javacpp.helper.opencv_objdetect {
    static { Loader.load(); }

// Parsed from <opencv2/objdetect/objdetect_c.h>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_OBJDETECT_C_H__
// #define __OPENCV_OBJDETECT_C_H__

// #include "opencv2/core/core_c.h"

// #ifdef __cplusplus
// #include <deque>
// #include <vector>
// #endif

/** \addtogroup objdetect_c
  \{
  */

/****************************************************************************************\
*                         Haar-like Object Detection functions                           *
\****************************************************************************************/

public static final int CV_HAAR_MAGIC_VAL =    0x42500000;
public static final String CV_TYPE_NAME_HAAR =    "opencv-haar-classifier";

// #define CV_IS_HAAR_CLASSIFIER( haar )
//     ((haar) != NULL &&
//     (((const CvHaarClassifierCascade*)(haar))->flags & CV_MAGIC_MASK)==CV_HAAR_MAGIC_VAL)

public static final int CV_HAAR_FEATURE_MAX =  3;

public static class CvHaarFeature extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHaarFeature() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHaarFeature(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHaarFeature(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHaarFeature position(long position) {
        return (CvHaarFeature)super.position(position);
    }

    public native int tilted(); public native CvHaarFeature tilted(int tilted);
        @Name({"rect", ".r"}) public native @ByRef CvRect rect_r(int i); public native CvHaarFeature rect_r(int i, CvRect rect_r);
        @Name({"rect", ".weight"}) public native float rect_weight(int i); public native CvHaarFeature rect_weight(int i, float rect_weight);
}

public static class CvHaarClassifier extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHaarClassifier() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHaarClassifier(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHaarClassifier(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHaarClassifier position(long position) {
        return (CvHaarClassifier)super.position(position);
    }

    public native int count(); public native CvHaarClassifier count(int count);
    public native CvHaarFeature haar_feature(); public native CvHaarClassifier haar_feature(CvHaarFeature haar_feature);
    public native FloatPointer threshold(); public native CvHaarClassifier threshold(FloatPointer threshold);
    public native IntPointer left(); public native CvHaarClassifier left(IntPointer left);
    public native IntPointer right(); public native CvHaarClassifier right(IntPointer right);
    public native FloatPointer alpha(); public native CvHaarClassifier alpha(FloatPointer alpha);
}

public static class CvHaarStageClassifier extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHaarStageClassifier() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHaarStageClassifier(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHaarStageClassifier(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHaarStageClassifier position(long position) {
        return (CvHaarStageClassifier)super.position(position);
    }

    public native int count(); public native CvHaarStageClassifier count(int count);
    public native float threshold(); public native CvHaarStageClassifier threshold(float threshold);
    public native CvHaarClassifier classifier(); public native CvHaarStageClassifier classifier(CvHaarClassifier classifier);

    public native int next(); public native CvHaarStageClassifier next(int next);
    public native int child(); public native CvHaarStageClassifier child(int child);
    public native int parent(); public native CvHaarStageClassifier parent(int parent);
}

@Opaque public static class CvHidHaarClassifierCascade extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CvHidHaarClassifierCascade() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHidHaarClassifierCascade(Pointer p) { super(p); }
}

public static class CvHaarClassifierCascade extends AbstractCvHaarClassifierCascade {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvHaarClassifierCascade() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvHaarClassifierCascade(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvHaarClassifierCascade(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvHaarClassifierCascade position(long position) {
        return (CvHaarClassifierCascade)super.position(position);
    }

    public native int flags(); public native CvHaarClassifierCascade flags(int flags);
    public native int count(); public native CvHaarClassifierCascade count(int count);
    public native @ByRef CvSize orig_window_size(); public native CvHaarClassifierCascade orig_window_size(CvSize orig_window_size);
    public native @ByRef CvSize real_window_size(); public native CvHaarClassifierCascade real_window_size(CvSize real_window_size);
    public native double scale(); public native CvHaarClassifierCascade scale(double scale);
    public native CvHaarStageClassifier stage_classifier(); public native CvHaarClassifierCascade stage_classifier(CvHaarStageClassifier stage_classifier);
    public native CvHidHaarClassifierCascade hid_cascade(); public native CvHaarClassifierCascade hid_cascade(CvHidHaarClassifierCascade hid_cascade);
}

public static class CvAvgComp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvAvgComp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvAvgComp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvAvgComp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvAvgComp position(long position) {
        return (CvAvgComp)super.position(position);
    }

    public native @ByRef CvRect rect(); public native CvAvgComp rect(CvRect rect);
    public native int neighbors(); public native CvAvgComp neighbors(int neighbors);
}

/* Loads haar classifier cascade from a directory.
   It is obsolete: convert your cascade to xml and use cvLoad instead */
public static native CvHaarClassifierCascade cvLoadHaarClassifierCascade(
                    @Cast("const char*") BytePointer directory, @ByVal CvSize orig_window_size);
public static native CvHaarClassifierCascade cvLoadHaarClassifierCascade(
                    String directory, @ByVal CvSize orig_window_size);

public static native void cvReleaseHaarClassifierCascade( @Cast("CvHaarClassifierCascade**") PointerPointer cascade );
public static native void cvReleaseHaarClassifierCascade( @ByPtrPtr CvHaarClassifierCascade cascade );

public static final int CV_HAAR_DO_CANNY_PRUNING =    1;
public static final int CV_HAAR_SCALE_IMAGE =         2;
public static final int CV_HAAR_FIND_BIGGEST_OBJECT = 4;
public static final int CV_HAAR_DO_ROUGH_SEARCH =     8;

public static native CvSeq cvHaarDetectObjects( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     double scale_factor/*=1.1*/,
                     int min_neighbors/*=3*/, int flags/*=0*/,
                     @ByVal(nullValue = "cvSize(0,0)") CvSize min_size/*=cvSize(0,0)*/, @ByVal(nullValue = "cvSize(0,0)") CvSize max_size/*=cvSize(0,0)*/);
public static native CvSeq cvHaarDetectObjects( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage);

/* sets images for haar classifier cascade */
public static native void cvSetImagesForHaarClassifierCascade( CvHaarClassifierCascade cascade,
                                                @Const CvArr sum, @Const CvArr sqsum,
                                                @Const CvArr tilted_sum, double scale );

/* runs the cascade on the specified window */
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal CvPoint pt, int start_stage/*=0*/);
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal CvPoint pt);
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal @Cast("CvPoint*") IntBuffer pt, int start_stage/*=0*/);
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal @Cast("CvPoint*") IntBuffer pt);
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal @Cast("CvPoint*") int[] pt, int start_stage/*=0*/);
public static native int cvRunHaarClassifierCascade( @Const CvHaarClassifierCascade cascade,
                                       @ByVal @Cast("CvPoint*") int[] pt);

/** \} objdetect_c */

// #ifdef __cplusplus

public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector IntPointer rejectLevels, @StdVector DoublePointer levelWeightds,
                     double scale_factor/*=1.1*/,
                     int min_neighbors/*=3*/, int flags/*=0*/,
                     @ByVal(nullValue = "cvSize(0, 0)") CvSize min_size/*=cvSize(0, 0)*/, @ByVal(nullValue = "cvSize(0, 0)") CvSize max_size/*=cvSize(0, 0)*/,
                     @Cast("bool") boolean outputRejectLevels/*=false*/ );
public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector IntPointer rejectLevels, @StdVector DoublePointer levelWeightds );
public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector IntBuffer rejectLevels, @StdVector DoubleBuffer levelWeightds,
                     double scale_factor/*=1.1*/,
                     int min_neighbors/*=3*/, int flags/*=0*/,
                     @ByVal(nullValue = "cvSize(0, 0)") CvSize min_size/*=cvSize(0, 0)*/, @ByVal(nullValue = "cvSize(0, 0)") CvSize max_size/*=cvSize(0, 0)*/,
                     @Cast("bool") boolean outputRejectLevels/*=false*/ );
public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector IntBuffer rejectLevels, @StdVector DoubleBuffer levelWeightds );
public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector int[] rejectLevels, @StdVector double[] levelWeightds,
                     double scale_factor/*=1.1*/,
                     int min_neighbors/*=3*/, int flags/*=0*/,
                     @ByVal(nullValue = "cvSize(0, 0)") CvSize min_size/*=cvSize(0, 0)*/, @ByVal(nullValue = "cvSize(0, 0)") CvSize max_size/*=cvSize(0, 0)*/,
                     @Cast("bool") boolean outputRejectLevels/*=false*/ );
public static native CvSeq cvHaarDetectObjectsForROC( @Const CvArr image,
                     CvHaarClassifierCascade cascade, CvMemStorage storage,
                     @StdVector int[] rejectLevels, @StdVector double[] levelWeightds );

// #endif

// #endif /* __OPENCV_OBJDETECT_C_H__ */


// Parsed from <opencv2/objdetect.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_OBJDETECT_HPP__
// #define __OPENCV_OBJDETECT_HPP__

// #include "opencv2/core.hpp"

/**
\defgroup objdetect Object Detection
<p>
Haar Feature-based Cascade Classifier for Object Detection
----------------------------------------------------------
<p>
The object detector described below has been initially proposed by Paul Viola \cite Viola01 and
improved by Rainer Lienhart \cite Lienhart02 .
<p>
First, a classifier (namely a *cascade of boosted classifiers working with haar-like features*) is
trained with a few hundred sample views of a particular object (i.e., a face or a car), called
positive examples, that are scaled to the same size (say, 20x20), and negative examples - arbitrary
images of the same size.
<p>
After a classifier is trained, it can be applied to a region of interest (of the same size as used
during the training) in an input image. The classifier outputs a "1" if the region is likely to show
the object (i.e., face/car), and "0" otherwise. To search for the object in the whole image one can
move the search window across the image and check every location using the classifier. The
classifier is designed so that it can be easily "resized" in order to be able to find the objects of
interest at different sizes, which is more efficient than resizing the image itself. So, to find an
object of an unknown size in the image the scan procedure should be done several times at different
scales.
<p>
The word "cascade" in the classifier name means that the resultant classifier consists of several
simpler classifiers (*stages*) that are applied subsequently to a region of interest until at some
stage the candidate is rejected or all the stages are passed. The word "boosted" means that the
classifiers at every stage of the cascade are complex themselves and they are built out of basic
classifiers using one of four different boosting techniques (weighted voting). Currently Discrete
Adaboost, Real Adaboost, Gentle Adaboost and Logitboost are supported. The basic classifiers are
decision-tree classifiers with at least 2 leaves. Haar-like features are the input to the basic
classifiers, and are calculated as described below. The current algorithm uses the following
Haar-like features:
<p>
![image](pics/haarfeatures.png)
<p>
The feature used in a particular classifier is specified by its shape (1a, 2b etc.), position within
the region of interest and the scale (this scale is not the same as the scale used at the detection
stage, though these two scales are multiplied). For example, in the case of the third line feature
(2c) the response is calculated as the difference between the sum of image pixels under the
rectangle covering the whole feature (including the two white stripes and the black stripe in the
middle) and the sum of the image pixels under the black stripe multiplied by 3 in order to
compensate for the differences in the size of areas. The sums of pixel values over a rectangular
regions are calculated rapidly using integral images (see below and the integral description).
<p>
To see the object detector at work, have a look at the facedetect demo:
<https://github.com/Itseez/opencv/tree/master/samples/cpp/dbt_face_detection.cpp>
<p>
The following reference is for the detection part only. There is a separate application called
opencv_traincascade that can train a cascade of boosted classifiers from a set of samples.
<p>
\note In the new C++ interface it is also possible to use LBP (local binary pattern) features in
addition to Haar-like features. .. [Viola01] Paul Viola and Michael J. Jones. Rapid Object Detection
using a Boosted Cascade of Simple Features. IEEE CVPR, 2001. The paper is available online at
<http://research.microsoft.com/en-us/um/people/viola/Pubs/Detect/violaJones_CVPR2001.pdf>
<p>
\{
    \defgroup objdetect_c C API
\}
 */

/** \addtogroup objdetect
 *  \{
<p>
///////////////////////////// Object Detection ////////////////////////////
 <p>
 *  class for grouping object candidates, detected by Cascade Classifier, HOG etc.
 *  instance of the class is to be passed to cv::partition (see cxoperations.hpp) */
@Namespace("cv") @NoOffset public static class SimilarRects extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimilarRects(Pointer p) { super(p); }

    public SimilarRects(double _eps) { super((Pointer)null); allocate(_eps); }
    private native void allocate(double _eps);
    public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef Rect r1, @Const @ByRef Rect r2);
    public native double eps(); public native SimilarRects eps(double eps);
}

/** \brief Groups the object candidate rectangles.
<p>
@param rectList Input/output vector of rectangles. Output vector includes retained and grouped
rectangles. (The Python list is not modified in place.)
@param groupThreshold Minimum possible number of rectangles minus 1. The threshold is used in a
group of rectangles to retain it.
@param eps Relative difference between sides of the rectangles to merge them into a group.
<p>
The function is a wrapper for the generic function partition . It clusters all the input rectangles
using the rectangle equivalence criteria that combines rectangles with similar sizes and similar
locations. The similarity is defined by eps. When eps=0 , no clustering is done at all. If
\f$\texttt{eps}\rightarrow +\inf\f$ , all the rectangles are put in one cluster. Then, the small
clusters containing less than or equal to groupThreshold rectangles are rejected. In each other
cluster, the average rectangle is computed and put into the output rectangle list.
 */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntPointer weights, @StdVector DoublePointer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntBuffer weights, @StdVector DoubleBuffer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector int[] weights, @StdVector double[] levelWeights );
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize/*=cv::Size(64, 128)*/);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize/*=cv::Size(64, 128)*/);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize/*=cv::Size(64, 128)*/);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales);



/** enum cv:: */
public static final int CASCADE_DO_CANNY_PRUNING    = 1,
       CASCADE_SCALE_IMAGE         = 2,
       CASCADE_FIND_BIGGEST_OBJECT = 4,
       CASCADE_DO_ROUGH_SEARCH     = 8;

@Namespace("cv") public static class BaseCascadeClassifier extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseCascadeClassifier(Pointer p) { super(p); }

    public native @Cast("bool") boolean empty();
    public native @Cast("bool") boolean load( @Str BytePointer filename );
    public native @Cast("bool") boolean load( @Str String filename );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );

    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector IntPointer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector IntBuffer numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );
    public native void detectMultiScale( @ByVal Mat image,
                               @ByRef RectVector objects,
                               @StdVector int[] numDetections,
                               double scaleFactor,
                               int minNeighbors, int flags,
                               @ByVal Size minSize, @ByVal Size maxSize );

    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntPointer rejectLevels,
                                       @StdVector DoublePointer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector IntBuffer rejectLevels,
                                       @StdVector DoubleBuffer levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );
    public native void detectMultiScale( @ByVal Mat image,
                                       @ByRef RectVector objects,
                                       @StdVector int[] rejectLevels,
                                       @StdVector double[] levelWeights,
                                       double scaleFactor,
                                       int minNeighbors, int flags,
                                       @ByVal Size minSize, @ByVal Size maxSize,
                                       @Cast("bool") boolean outputRejectLevels );

    public native @Cast("bool") boolean isOldFormatCascade();
    public native @ByVal Size getOriginalWindowSize();
    public native int getFeatureType();
    public native Pointer getOldCascade();

    public static class MaskGenerator extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MaskGenerator(Pointer p) { super(p); }
    
        public native @ByVal Mat generateMask(@Const @ByRef Mat src);
        public native void initializeMask(@Const @ByRef Mat arg0);
    }
    public native void setMaskGenerator(@Ptr MaskGenerator maskGenerator);
    public native @Ptr MaskGenerator getMaskGenerator();
}

/** \brief Cascade classifier class for object detection.
 */
@Namespace("cv") @NoOffset public static class CascadeClassifier extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CascadeClassifier(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CascadeClassifier(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CascadeClassifier position(long position) {
        return (CascadeClassifier)super.position(position);
    }

    public CascadeClassifier() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief Loads a classifier from a file.
    <p>
    @param filename Name of the file from which the classifier is loaded.
     */
    public CascadeClassifier(@Str BytePointer filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str BytePointer filename);
    public CascadeClassifier(@Str String filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str String filename);
    /** \brief Checks whether the classifier has been loaded.
    */
    public native @Cast("bool") boolean empty();
    /** \brief Loads a classifier from a file.
    <p>
    @param filename Name of the file from which the classifier is loaded. The file may contain an old
    HAAR classifier trained by the haartraining application or a new cascade classifier trained by the
    traincascade application.
     */
    public native @Cast("bool") boolean load( @Str BytePointer filename );
    public native @Cast("bool") boolean load( @Str String filename );
    /** \brief Reads a classifier from a FileStorage node.
    <p>
    \note The file may contain a new cascade classifier (trained traincascade application) only.
     */
    public native @Cast("bool") boolean read( @Const @ByRef FileNode node );

    /** \brief Detects objects of different sizes in the input image. The detected objects are returned as a list
    of rectangles.
    <p>
    @param image Matrix of the type CV_8U containing an image where objects are detected.
    @param objects Vector of rectangles where each rectangle contains the detected object, the
    rectangles may be partially outside the original image.
    @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
    @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
    to retain it.
    @param flags Parameter with the same meaning for an old cascade as in the function
    cvHaarDetectObjects. It is not used for a new cascade.
    @param minSize Minimum possible object size. Objects smaller than that are ignored.
    @param maxSize Maximum possible object size. Objects larger than that are ignored.
    <p>
    The function is parallelized with the TBB library.
    <p>
    \note
       -   (Python) A face detection example using cascade classifiers can be found at
            opencv_source_code/samples/python/facedetect.py
    */
    public native void detectMultiScale( @ByVal Mat image,
                              @ByRef RectVector objects,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                              @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/ );
    public native void detectMultiScale( @ByVal Mat image,
                              @ByRef RectVector objects );

    /** \overload
    @param image Matrix of the type CV_8U containing an image where objects are detected.
    @param objects Vector of rectangles where each rectangle contains the detected object, the
    rectangles may be partially outside the original image.
    @param numDetections Vector of detection numbers for the corresponding objects. An object's number
    of detections is the number of neighboring positively classified rectangles that were joined
    together to form the object.
    @param scaleFactor Parameter specifying how much the image size is reduced at each image scale.
    @param minNeighbors Parameter specifying how many neighbors each candidate rectangle should have
    to retain it.
    @param flags Parameter with the same meaning for an old cascade as in the function
    cvHaarDetectObjects. It is not used for a new cascade.
    @param minSize Minimum possible object size. Objects smaller than that are ignored.
    @param maxSize Maximum possible object size. Objects larger than that are ignored.
    */
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                              @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/ );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntPointer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                              @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/ );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector IntBuffer numDetections );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections,
                              double scaleFactor/*=1.1*/,
                              int minNeighbors/*=3*/, int flags/*=0*/,
                              @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                              @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/ );
    public native @Name("detectMultiScale") void detectMultiScale2( @ByVal Mat image,
                              @ByRef RectVector objects,
                              @StdVector int[] numDetections );

    /** \overload
    if {@code outputRejectLevels} is {@code true} returns {@code rejectLevels} and {@code levelWeights}
    */
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntPointer rejectLevels,
                                      @StdVector DoublePointer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector IntBuffer rejectLevels,
                                      @StdVector DoubleBuffer levelWeights );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights,
                                      double scaleFactor/*=1.1*/,
                                      int minNeighbors/*=3*/, int flags/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size minSize/*=cv::Size()*/,
                                      @ByVal(nullValue = "cv::Size()") Size maxSize/*=cv::Size()*/,
                                      @Cast("bool") boolean outputRejectLevels/*=false*/ );
    public native @Name("detectMultiScale") void detectMultiScale3( @ByVal Mat image,
                                      @ByRef RectVector objects,
                                      @StdVector int[] rejectLevels,
                                      @StdVector double[] levelWeights );

    public native @Cast("bool") boolean isOldFormatCascade();
    public native @ByVal Size getOriginalWindowSize();
    public native int getFeatureType();
    public native Pointer getOldCascade();

    public static native @Cast("bool") boolean convert(@Str BytePointer oldcascade, @Str BytePointer newcascade);
    public static native @Cast("bool") boolean convert(@Str String oldcascade, @Str String newcascade);

    public native void setMaskGenerator(@Ptr BaseCascadeClassifier.MaskGenerator maskGenerator);
    public native @Ptr BaseCascadeClassifier.MaskGenerator getMaskGenerator();

    public native @Ptr BaseCascadeClassifier cc(); public native CascadeClassifier cc(BaseCascadeClassifier cc);
}

@Namespace("cv") public static native @Ptr BaseCascadeClassifier.MaskGenerator createFaceDetectionMaskGenerator();

//////////////// HOG (Histogram-of-Oriented-Gradients) Descriptor and Object Detector //////////////

/** struct for detection region of interest (ROI) */
@Namespace("cv") public static class DetectionROI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionROI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionROI(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionROI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionROI position(long position) {
        return (DetectionROI)super.position(position);
    }

   /** scale(size) of the bounding box */
   public native double scale(); public native DetectionROI scale(double scale);
   /** set of requrested locations to be evaluated */
   public native @ByRef PointVector locations(); public native DetectionROI locations(PointVector locations);
   /** vector that will contain confidence values for each location */
   public native @StdVector DoublePointer confidences(); public native DetectionROI confidences(DoublePointer confidences);
}

@Namespace("cv") @NoOffset public static class HOGDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HOGDescriptor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HOGDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HOGDescriptor position(long position) {
        return (HOGDescriptor)super.position(position);
    }

    /** enum cv::HOGDescriptor:: */
    public static final int L2Hys = 0;
    /** enum cv::HOGDescriptor:: */
    public static final int DEFAULT_NLEVELS = 64;

    public HOGDescriptor() { super((Pointer)null); allocate(); }
    private native void allocate();

    public HOGDescriptor(@ByVal Size _winSize, @ByVal Size _blockSize, @ByVal Size _blockStride,
                      @ByVal Size _cellSize, int _nbins, int _derivAperture/*=1*/, double _winSigma/*=-1*/,
                      int _histogramNormType/*=cv::HOGDescriptor::L2Hys*/,
                      double _L2HysThreshold/*=0.2*/, @Cast("bool") boolean _gammaCorrection/*=false*/,
                      int _nlevels/*=cv::HOGDescriptor::DEFAULT_NLEVELS*/, @Cast("bool") boolean _signedGradient/*=false*/) { super((Pointer)null); allocate(_winSize, _blockSize, _blockStride, _cellSize, _nbins, _derivAperture, _winSigma, _histogramNormType, _L2HysThreshold, _gammaCorrection, _nlevels, _signedGradient); }
    private native void allocate(@ByVal Size _winSize, @ByVal Size _blockSize, @ByVal Size _blockStride,
                      @ByVal Size _cellSize, int _nbins, int _derivAperture/*=1*/, double _winSigma/*=-1*/,
                      int _histogramNormType/*=cv::HOGDescriptor::L2Hys*/,
                      double _L2HysThreshold/*=0.2*/, @Cast("bool") boolean _gammaCorrection/*=false*/,
                      int _nlevels/*=cv::HOGDescriptor::DEFAULT_NLEVELS*/, @Cast("bool") boolean _signedGradient/*=false*/);
    public HOGDescriptor(@ByVal Size _winSize, @ByVal Size _blockSize, @ByVal Size _blockStride,
                      @ByVal Size _cellSize, int _nbins) { super((Pointer)null); allocate(_winSize, _blockSize, _blockStride, _cellSize, _nbins); }
    private native void allocate(@ByVal Size _winSize, @ByVal Size _blockSize, @ByVal Size _blockStride,
                      @ByVal Size _cellSize, int _nbins);

    public HOGDescriptor(@Str BytePointer filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str BytePointer filename);
    public HOGDescriptor(@Str String filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str String filename);

    public HOGDescriptor(@Const @ByRef HOGDescriptor d) { super((Pointer)null); allocate(d); }
    private native void allocate(@Const @ByRef HOGDescriptor d);

    public native @Cast("size_t") long getDescriptorSize();
    public native @Cast("bool") boolean checkDetectorSize();
    public native double getWinSigma();

    public native void setSVMDetector(@ByVal Mat _svmdetector);

    public native @Cast("bool") boolean read(@ByRef FileNode fn);
    public native void write(@ByRef FileStorage fs, @Str BytePointer objname);
    public native void write(@ByRef FileStorage fs, @Str String objname);

    public native @Cast("bool") boolean load(@Str BytePointer filename, @Str BytePointer objname/*=cv::String()*/);
    public native @Cast("bool") boolean load(@Str BytePointer filename);
    public native @Cast("bool") boolean load(@Str String filename, @Str String objname/*=cv::String()*/);
    public native @Cast("bool") boolean load(@Str String filename);
    public native void save(@Str BytePointer filename, @Str BytePointer objname/*=cv::String()*/);
    public native void save(@Str BytePointer filename);
    public native void save(@Str String filename, @Str String objname/*=cv::String()*/);
    public native void save(@Str String filename);
    public native void copyTo(@ByRef HOGDescriptor c);

    public native void compute(@ByVal Mat img,
                             @StdVector FloatPointer descriptors,
                             @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                             @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector locations/*=std::vector<cv::Point>()*/);
    public native void compute(@ByVal Mat img,
                             @StdVector FloatPointer descriptors);
    public native void compute(@ByVal Mat img,
                             @StdVector FloatBuffer descriptors,
                             @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                             @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector locations/*=std::vector<cv::Point>()*/);
    public native void compute(@ByVal Mat img,
                             @StdVector FloatBuffer descriptors);
    public native void compute(@ByVal Mat img,
                             @StdVector float[] descriptors,
                             @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                             @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector locations/*=std::vector<cv::Point>()*/);
    public native void compute(@ByVal Mat img,
                             @StdVector float[] descriptors);

    /** with found weights output */
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector DoublePointer weights,
                            double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                            @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                            @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector searchLocations/*=std::vector<cv::Point>()*/);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector DoublePointer weights);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector DoubleBuffer weights,
                            double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                            @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                            @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector searchLocations/*=std::vector<cv::Point>()*/);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector DoubleBuffer weights);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector double[] weights,
                            double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                            @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                            @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector searchLocations/*=std::vector<cv::Point>()*/);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            @StdVector double[] weights);
    /** without found weights output */
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations,
                            double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                            @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/,
                            @Const @ByRef(nullValue = "std::vector<cv::Point>()") PointVector searchLocations/*=std::vector<cv::Point>()*/);
    public native void detect(@Const @ByRef Mat img, @ByRef PointVector foundLocations);

    /** with result weights output */
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector DoublePointer foundWeights, double hitThreshold/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/, double scale/*=1.05*/,
                                      double finalThreshold/*=2.0*/,@Cast("bool") boolean useMeanshiftGrouping/*=false*/);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector DoublePointer foundWeights);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector DoubleBuffer foundWeights, double hitThreshold/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/, double scale/*=1.05*/,
                                      double finalThreshold/*=2.0*/,@Cast("bool") boolean useMeanshiftGrouping/*=false*/);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector DoubleBuffer foundWeights);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector double[] foundWeights, double hitThreshold/*=0*/,
                                      @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/, double scale/*=1.05*/,
                                      double finalThreshold/*=2.0*/,@Cast("bool") boolean useMeanshiftGrouping/*=false*/);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      @StdVector double[] foundWeights);
    /** without found weights output */
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations,
                                      double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                                      @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/, double scale/*=1.05*/,
                                      double finalThreshold/*=2.0*/, @Cast("bool") boolean useMeanshiftGrouping/*=false*/);
    public native void detectMultiScale(@ByVal Mat img, @ByRef RectVector foundLocations);

    public native void computeGradient(@Const @ByRef Mat img, @ByRef Mat grad, @ByRef Mat angleOfs,
                                     @ByVal(nullValue = "cv::Size()") Size paddingTL/*=cv::Size()*/, @ByVal(nullValue = "cv::Size()") Size paddingBR/*=cv::Size()*/);
    public native void computeGradient(@Const @ByRef Mat img, @ByRef Mat grad, @ByRef Mat angleOfs);

    public static native @StdVector FloatPointer getDefaultPeopleDetector();
    public static native @StdVector FloatPointer getDaimlerPeopleDetector();

    public native @ByRef Size winSize(); public native HOGDescriptor winSize(Size winSize);
    public native @ByRef Size blockSize(); public native HOGDescriptor blockSize(Size blockSize);
    public native @ByRef Size blockStride(); public native HOGDescriptor blockStride(Size blockStride);
    public native @ByRef Size cellSize(); public native HOGDescriptor cellSize(Size cellSize);
    public native int nbins(); public native HOGDescriptor nbins(int nbins);
    public native int derivAperture(); public native HOGDescriptor derivAperture(int derivAperture);
    public native double winSigma(); public native HOGDescriptor winSigma(double winSigma);
    public native int histogramNormType(); public native HOGDescriptor histogramNormType(int histogramNormType);
    public native double L2HysThreshold(); public native HOGDescriptor L2HysThreshold(double L2HysThreshold);
    public native @Cast("bool") boolean gammaCorrection(); public native HOGDescriptor gammaCorrection(boolean gammaCorrection);
    public native @StdVector FloatPointer svmDetector(); public native HOGDescriptor svmDetector(FloatPointer svmDetector);
    public native @ByRef UMat oclSvmDetector(); public native HOGDescriptor oclSvmDetector(UMat oclSvmDetector);
    public native float free_coef(); public native HOGDescriptor free_coef(float free_coef);
    public native int nlevels(); public native HOGDescriptor nlevels(int nlevels);
    public native @Cast("bool") boolean signedGradient(); public native HOGDescriptor signedGradient(boolean signedGradient);


    /** evaluate specified ROI and return confidence value for each location */
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector DoublePointer confidences,
                                       double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                                       @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/);
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector DoublePointer confidences);
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector DoubleBuffer confidences,
                                       double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                                       @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/);
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector DoubleBuffer confidences);
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector double[] confidences,
                                       double hitThreshold/*=0*/, @ByVal(nullValue = "cv::Size()") Size winStride/*=cv::Size()*/,
                                       @ByVal(nullValue = "cv::Size()") Size padding/*=cv::Size()*/);
    public native void detectROI(@Const @ByRef Mat img, @Const @ByRef PointVector locations,
                                       @ByRef PointVector foundLocations, @StdVector double[] confidences);

    /** evaluate specified ROI and return confidence value for each location in multiple scales */
    public native void detectMultiScaleROI(@Const @ByRef Mat img,
                                                           @ByRef RectVector foundLocations,
                                                           @StdVector DetectionROI locations,
                                                           double hitThreshold/*=0*/,
                                                           int groupThreshold/*=0*/);
    public native void detectMultiScaleROI(@Const @ByRef Mat img,
                                                           @ByRef RectVector foundLocations,
                                                           @StdVector DetectionROI locations);

    /** read/parse Dalal's alt model file */
    public native void readALTModel(@Str BytePointer modelfile);
    public native void readALTModel(@Str String modelfile);
    public native void groupRectangles(@ByRef RectVector rectList, @StdVector DoublePointer weights, int groupThreshold, double eps);
    public native void groupRectangles(@ByRef RectVector rectList, @StdVector DoubleBuffer weights, int groupThreshold, double eps);
    public native void groupRectangles(@ByRef RectVector rectList, @StdVector double[] weights, int groupThreshold, double eps);
}

/** \} objdetect */



// #include "opencv2/objdetect/detection_based_tracker.hpp"

// #ifndef DISABLE_OPENCV_24_COMPATIBILITY
// #include "opencv2/objdetect/objdetect_c.h"
// #endif

// #endif


// Parsed from <opencv2/objdetect/detection_based_tracker.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_OBJDETECT_DBT_HPP__
// #define __OPENCV_OBJDETECT_DBT_HPP__

// After this condition removal update blacklist for bindings: modules/python/common.cmake
// #if defined(__linux__) || defined(LINUX) || defined(__APPLE__) || defined(__ANDROID__) ||
//   (defined(__cplusplus) &&  __cplusplus > 201103L) || (defined(_MSC_VER) && _MSC_VER >= 1700)

// #include <vector>

/** \addtogroup objdetect
 *  \{ */

@Namespace("cv") @NoOffset public static class DetectionBasedTracker extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionBasedTracker(Pointer p) { super(p); }

        @NoOffset public static class Parameters extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Parameters(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public Parameters(long size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(long size);
            @Override public Parameters position(long position) {
                return (Parameters)super.position(position);
            }
        
            public native int maxTrackLifetime(); public native Parameters maxTrackLifetime(int maxTrackLifetime);
            public native int minDetectionPeriod(); public native Parameters minDetectionPeriod(int minDetectionPeriod); //the minimal time between run of the big object detector (on the whole frame) in ms (1000 mean 1 sec), default=0

            public Parameters() { super((Pointer)null); allocate(); }
            private native void allocate();
        }

        @NoOffset public static class IDetector extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public IDetector(Pointer p) { super(p); }
        

                public native void detect(@Const @ByRef Mat image, @ByRef RectVector objects);

                public native void setMinObjectSize(@Const @ByRef Size min);
                public native void setMaxObjectSize(@Const @ByRef Size max);
                public native @ByVal Size getMinObjectSize();
                public native @ByVal Size getMaxObjectSize();
                public native float getScaleFactor();
                public native void setScaleFactor(float value);
                public native int getMinNeighbours();
                public native void setMinNeighbours(int value);
        }

        public DetectionBasedTracker(@Ptr IDetector mainDetector, @Ptr IDetector trackingDetector, @Const @ByRef Parameters params) { super((Pointer)null); allocate(mainDetector, trackingDetector, params); }
        private native void allocate(@Ptr IDetector mainDetector, @Ptr IDetector trackingDetector, @Const @ByRef Parameters params);

        public native @Cast("bool") boolean run();
        public native void stop();
        public native void resetTracking();

        public native void process(@Const @ByRef Mat imageGray);

        public native @Cast("bool") boolean setParameters(@Const @ByRef Parameters params);
        public native @Const @ByRef Parameters getParameters();
        public native void getObjects(@ByRef RectVector result);
        public native void getObjects(@Cast("cv::DetectionBasedTracker::Object*") @StdVector IntIntPair result);

        /** enum cv::DetectionBasedTracker::ObjectStatus */
        public static final int
            DETECTED_NOT_SHOWN_YET = 0,
            DETECTED = 1,
            DETECTED_TEMPORARY_LOST = 2,
            WRONG_OBJECT = 3;
        @NoOffset public static class ExtObject extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public ExtObject(Pointer p) { super(p); }
        
            public native int id(); public native ExtObject id(int id);
            public native @ByRef Rect location(); public native ExtObject location(Rect location);
            public native @Cast("cv::DetectionBasedTracker::ObjectStatus") int status(); public native ExtObject status(int status);
            public ExtObject(int _id, @ByVal Rect _location, @Cast("cv::DetectionBasedTracker::ObjectStatus") int _status) { super((Pointer)null); allocate(_id, _location, _status); }
            private native void allocate(int _id, @ByVal Rect _location, @Cast("cv::DetectionBasedTracker::ObjectStatus") int _status);
        }
        public native void getObjects(@StdVector ExtObject result);


        public native int addObject(@Const @ByRef Rect location);
}

/** \} objdetect */

 //end of cv namespace
// #endif

// #endif


}
