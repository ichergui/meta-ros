# Generated by superflore -- DO NOT EDIT

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides a driver node for KVH GEO FOG 3D INS sensors, messages, and rviz plugins."
AUTHOR = "Zach LaCelle <zlacelle@mitre.org>"
ROS_AUTHOR = "Zach LaCelle <zlacelle@mitre.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "kvh_geo_fog_3d"
ROS_BPN = "kvh_geo_fog_3d"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    kvh-geo-fog-3d-driver \
    kvh-geo-fog-3d-msgs \
    kvh-geo-fog-3d-rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/MITRE/kvh_geo_fog_3d-release/archive/release/melodic/kvh_geo_fog_3d/1.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/kvh_geo_fog_3d"
SRC_URI = "git://github.com/MITRE/kvh_geo_fog_3d-release;${ROS_BRANCH};protocol=https"
SRCREV = "b6f90d2aa724c5923f88c1affb42969876df5ed6"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
