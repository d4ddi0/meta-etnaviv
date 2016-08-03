SUMMARY = "Libetnaviv"
DESCRIPTION = ""
LICENSE = "MIT"
inherit autotools pkgconfig distro_features_check

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LIC_FILES_CHKSUM = "file://src/etna.h;md5=390b1cc5e59ed226629eb47fbf25aa07"

SRCREV = "master"
SRC_URI = "git://github.com/xobs/libetnaviv.git \
    file://libetnaviv.patch \
    "

S = "${WORKDIR}/git"

EXTRA_OECONF += "--with-galcore-include=${S}/src"
