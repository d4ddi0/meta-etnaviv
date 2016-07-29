require ${BPN}.inc

DEFAULT_PREFERENCE = "1"

#SRCREV = "ea0d1f575c214c09ba3df12644a960e86e031766"
SRCREV = "e1ac825bd067f0bff475959dc41fccddc63bb0f9"
PV = "12.0"

#SRC_URI = "git://anongit.freedesktop.org/git/mesa/mesa;branch=10.5"
SRC_URI = "git://github.com/etnaviv/mesa.git;branch=12.0_etnaviv"

S = "${WORKDIR}/git"

DEPENDS += "python-mako-native"

inherit pythonnative

#because we cannot rely on the fact that all apps will use pkgconfig,
#make eglplatform.h independent of MESA_EGL_NO_X11_HEADER
do_install_append() {
    if ${@bb.utils.contains('PACKAGECONFIG', 'egl', 'true', 'false', d)}; then
        sed -i -e 's/^#if defined(MESA_EGL_NO_X11_HEADERS)$/#if defined(MESA_EGL_NO_X11_HEADERS) || ${@bb.utils.contains('PACKAGECONFIG', 'x11', '0', '1', d)}/' ${D}${includedir}/EGL/eglplatform.h
    fi
}
