SUMMARY = "Libetnaviv"
DESCRIPTION = ""
LICENSE = "GPL"
inherit autotools pkgconfig distro_features_check

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

LIC_FILES_CHKSUM = "file://README.md;md5=0c6d8322a82ca24a225d94dc76ed30bd"

SRCREV = "59170afe51b26468d0609474db068d87b093eb13"
SRC_URI = "git://github.com/xobs/libetnaviv.git;branch=master;protocol=http \
    file://libetnaviv.patch \
    "

S = "${WORKDIR}/git"

EXTRA_OECONF += "--with-galcore-include=${S}/src"
