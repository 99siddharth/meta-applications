DESCRIPTION = "Simple helloworld application FROM GIT"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/99siddharth/Yocto_trial_code.git;protocol=https"
S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"

do_compile() {
	${CC} Hello_yocto.c -o linkedlist ${LDFLAGS}
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 linkedlist ${D}${bindir}
}


