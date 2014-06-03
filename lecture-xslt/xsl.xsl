<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output media-type="xml" indent="yes"/>
    <xsl:template match="//table/tbody/tr">
       <p>
            <xsl:value-of select="td[2]/p[1]/text()"></xsl:value-of>
       </p>
    </xsl:template>

    <xsl:template match="/">
        <html>
            <body>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>