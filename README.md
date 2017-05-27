meta-etnaviv
============

meta-etnaviv is an OE/Yocto Project layer allowing the user to include the
open-source etnaviv drm driver in their image.

The etnaviv driver is an open-source, reverse-engineered alternative to the
closed-source vivante driver for vivante GPU chipsets. The vivante GPU is most
likely paired with NXP i.MX SoCs (e.g. i.MX6).

To enable, add this layer to your build, and add the following to your
configuration:

	MACHINEOVERRIDES .= ":use-mainline-bsp"


Dependencies
============

This layer depends on:

	git://git.openembedded.org/openembedded-core
	layer: meta

	https://git.yoctoproject.org/git/meta-freescale

Please use corresponding branches on all layers (including this one).
