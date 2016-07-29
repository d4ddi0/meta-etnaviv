HOMEPAGE = "http://dri.freedesktop.org"
SECTION = "x11/base"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://libdrm_lists.h;beginline=1;endline=25;md5=2af1df1026ba1d24c8e7c370e68ed198"
DEPENDS = "libdrm"
DEFAULT_PREFERENCE = "1"

SRCREV = "6b461c163b0bd02c76b65d94cc2fb3767167bda8"
SRC_URI = "git://ftp.arm.linux.org.uk/~rmk/libdrm-armada.git"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

