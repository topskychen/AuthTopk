#!bin/sh
java -Xmx2048M -classpath bin:lib/SrtreeCommon.jar/:lib/rtree_original.jar:lib/core.jar:lib/jdbm-2.4.jar -verbose:gc $1 $2 $3