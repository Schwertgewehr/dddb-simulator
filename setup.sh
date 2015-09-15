#!/bin/bash
ISERROR=0

cwd=`dirname "${0}"`
cd "${cwd}"

which npm > /dev/null 2>&1
if [ $? -ne 0 ] ; then
	echo "command not found: npm"
	echo "please install npm. e.g. brew install npm"
	ISERROR=1
fi

which electron > /dev/null 2>&1
if [ $? -ne 0 ] ; then
	echo "command not found: electron"
	echo "install electron-prebuilt..."
	npm -g install electron-prebuilt
	if [ $? -ne 0 ] ; then
		echo "failed"
		ISERROR=1
	fi
fi

rm -rf node_modules components && \
npm install && \
echo "SETUP OK!!"



npm -g install electron-prebuilt
