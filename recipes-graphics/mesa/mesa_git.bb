require ${BPN}.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEFAULT_PREFERENCE = "1"

SRCREV = "mesa-17.1.1"
PV = "12.0"

SRC_URI = "git://anongit.freedesktop.org/mesa/mesa;branch=17.1 \
           file://Mesa-dev-1-6-etnaviv-always-do-cpu_fini-in-transfer_unmap.patch \
           file://Mesa-dev-2-6-etnaviv-slim-down-resource-waiting.patch \
           file://Mesa-dev-3-6-etnaviv-honor-PIPE_TRANSFER_UNSYNCHRONIZED-flag.patch \
           file://Mesa-dev-4-6-etnaviv-don-t-read-back-resource-if-transfer-discards-contents.patch \
           file://Mesa-dev-5-6-etnaviv-simplify-transfer-tiling-handling.patch \
           file://Mesa-dev-6-6-etnaviv-upgrade-DISCARD_RANGE-to-DISCARD_WHOLE_RESOURCE-if-possible.patch"

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
