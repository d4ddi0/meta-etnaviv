require xorg-driver-video.inc

SUMMARY = "X.Org X server -- fbdev display driver"
DESCRIPTION = "fbdev is an Xorg driver for framebuffer devices. This is a non-accelerated driver."

LIC_FILES_CHKSUM = "file://README;md5=398023ad112dd65d0461eef7380a005f"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV = "novena-r2"
SRC_URI = "git://github.com/xobs/xserver-xorg-video-armada;branch=novena-r2;protocol=http \
           file://xf86-video-armada.patch"

S = "${WORKDIR}/git"

DEPENDS = "xserver-xorg libdrm libdrm-armada libetnaviv"

DEPENDS_${PN} += " xserver-xorg-module-exa \
                   xserver-xorg-extension-dri \
                   xserver-xorg-extension-dri2 \
                   xserver-xorg-extension-glx"

EXTRA_OECONF += "--enable-etnaviv \
		 --enable-etnadrm \
		 --disable-vivante \
		"
