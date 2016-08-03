# meta-etnaviv

meta-etnaviv is a layer for yocto to build accelerated graphics for
embedded Linux systems with a Vivante graphics chipset.

Both the etnaviv driver stack and this yocto layer are works in progress.
Use at your own risk, and if you find a bug with this layer, please let me
know, and ideally send a pull request.

This yocto layer is incompatible with the freescale (now nxp)
vendor provided Vivante (GalCore) libraries, and is thus explicitly
unusable with the yocto layer provided by nxp for imx6 boards.

To work, you will need a recent (v4.5 or higher) mainline Linux kernel with
etnaviv drm enabled.
