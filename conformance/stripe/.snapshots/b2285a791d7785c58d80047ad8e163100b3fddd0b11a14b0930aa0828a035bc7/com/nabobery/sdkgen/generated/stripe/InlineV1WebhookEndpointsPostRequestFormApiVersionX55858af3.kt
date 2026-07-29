package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Events sent to this endpoint will be generated with this Stripe Version instead of your account's default Stripe
 * Version.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1webhook_endpoints/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/api_version
 */
@Serializable(with = InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3.Serializer::class)
public sealed class InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `2011-01-01`.
   */
  public data object _20110101 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-01-01"
  }

  /**
   * Documented value. Wire value: `2011-06-21`.
   */
  public data object _20110621 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-06-21"
  }

  /**
   * Documented value. Wire value: `2011-06-28`.
   */
  public data object _20110628 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-06-28"
  }

  /**
   * Documented value. Wire value: `2011-08-01`.
   */
  public data object _20110801 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-08-01"
  }

  /**
   * Documented value. Wire value: `2011-09-15`.
   */
  public data object _20110915 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-09-15"
  }

  /**
   * Documented value. Wire value: `2011-11-17`.
   */
  public data object _20111117 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2011-11-17"
  }

  /**
   * Documented value. Wire value: `2012-02-23`.
   */
  public data object _20120223 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-02-23"
  }

  /**
   * Documented value. Wire value: `2012-03-25`.
   */
  public data object _20120325 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-03-25"
  }

  /**
   * Documented value. Wire value: `2012-06-18`.
   */
  public data object _20120618 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-06-18"
  }

  /**
   * Documented value. Wire value: `2012-06-28`.
   */
  public data object _20120628 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-06-28"
  }

  /**
   * Documented value. Wire value: `2012-07-09`.
   */
  public data object _20120709 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-07-09"
  }

  /**
   * Documented value. Wire value: `2012-09-24`.
   */
  public data object _20120924 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-09-24"
  }

  /**
   * Documented value. Wire value: `2012-10-26`.
   */
  public data object _20121026 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-10-26"
  }

  /**
   * Documented value. Wire value: `2012-11-07`.
   */
  public data object _20121107 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2012-11-07"
  }

  /**
   * Documented value. Wire value: `2013-02-11`.
   */
  public data object _20130211 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-02-11"
  }

  /**
   * Documented value. Wire value: `2013-02-13`.
   */
  public data object _20130213 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-02-13"
  }

  /**
   * Documented value. Wire value: `2013-07-05`.
   */
  public data object _20130705 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-07-05"
  }

  /**
   * Documented value. Wire value: `2013-08-12`.
   */
  public data object _20130812 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-08-12"
  }

  /**
   * Documented value. Wire value: `2013-08-13`.
   */
  public data object _20130813 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-08-13"
  }

  /**
   * Documented value. Wire value: `2013-10-29`.
   */
  public data object _20131029 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-10-29"
  }

  /**
   * Documented value. Wire value: `2013-12-03`.
   */
  public data object _20131203 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2013-12-03"
  }

  /**
   * Documented value. Wire value: `2014-01-31`.
   */
  public data object _20140131 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-01-31"
  }

  /**
   * Documented value. Wire value: `2014-03-13`.
   */
  public data object _20140313 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-03-13"
  }

  /**
   * Documented value. Wire value: `2014-03-28`.
   */
  public data object _20140328 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-03-28"
  }

  /**
   * Documented value. Wire value: `2014-05-19`.
   */
  public data object _20140519 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-05-19"
  }

  /**
   * Documented value. Wire value: `2014-06-13`.
   */
  public data object _20140613 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-06-13"
  }

  /**
   * Documented value. Wire value: `2014-06-17`.
   */
  public data object _20140617 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-06-17"
  }

  /**
   * Documented value. Wire value: `2014-07-22`.
   */
  public data object _20140722 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-07-22"
  }

  /**
   * Documented value. Wire value: `2014-07-26`.
   */
  public data object _20140726 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-07-26"
  }

  /**
   * Documented value. Wire value: `2014-08-04`.
   */
  public data object _20140804 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-08-04"
  }

  /**
   * Documented value. Wire value: `2014-08-20`.
   */
  public data object _20140820 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-08-20"
  }

  /**
   * Documented value. Wire value: `2014-09-08`.
   */
  public data object _20140908 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-09-08"
  }

  /**
   * Documented value. Wire value: `2014-10-07`.
   */
  public data object _20141007 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-10-07"
  }

  /**
   * Documented value. Wire value: `2014-11-05`.
   */
  public data object _20141105 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-11-05"
  }

  /**
   * Documented value. Wire value: `2014-11-20`.
   */
  public data object _20141120 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-11-20"
  }

  /**
   * Documented value. Wire value: `2014-12-08`.
   */
  public data object _20141208 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-12-08"
  }

  /**
   * Documented value. Wire value: `2014-12-17`.
   */
  public data object _20141217 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-12-17"
  }

  /**
   * Documented value. Wire value: `2014-12-22`.
   */
  public data object _20141222 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2014-12-22"
  }

  /**
   * Documented value. Wire value: `2015-01-11`.
   */
  public data object _20150111 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-01-11"
  }

  /**
   * Documented value. Wire value: `2015-01-26`.
   */
  public data object _20150126 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-01-26"
  }

  /**
   * Documented value. Wire value: `2015-02-10`.
   */
  public data object _20150210 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-02-10"
  }

  /**
   * Documented value. Wire value: `2015-02-16`.
   */
  public data object _20150216 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-02-16"
  }

  /**
   * Documented value. Wire value: `2015-02-18`.
   */
  public data object _20150218 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-02-18"
  }

  /**
   * Documented value. Wire value: `2015-03-24`.
   */
  public data object _20150324 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-03-24"
  }

  /**
   * Documented value. Wire value: `2015-04-07`.
   */
  public data object _20150407 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-04-07"
  }

  /**
   * Documented value. Wire value: `2015-06-15`.
   */
  public data object _20150615 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-06-15"
  }

  /**
   * Documented value. Wire value: `2015-07-07`.
   */
  public data object _20150707 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-07-07"
  }

  /**
   * Documented value. Wire value: `2015-07-13`.
   */
  public data object _20150713 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-07-13"
  }

  /**
   * Documented value. Wire value: `2015-07-28`.
   */
  public data object _20150728 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-07-28"
  }

  /**
   * Documented value. Wire value: `2015-08-07`.
   */
  public data object _20150807 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-08-07"
  }

  /**
   * Documented value. Wire value: `2015-08-19`.
   */
  public data object _20150819 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-08-19"
  }

  /**
   * Documented value. Wire value: `2015-09-03`.
   */
  public data object _20150903 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-09-03"
  }

  /**
   * Documented value. Wire value: `2015-09-08`.
   */
  public data object _20150908 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-09-08"
  }

  /**
   * Documented value. Wire value: `2015-09-23`.
   */
  public data object _20150923 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-09-23"
  }

  /**
   * Documented value. Wire value: `2015-10-01`.
   */
  public data object _20151001 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-10-01"
  }

  /**
   * Documented value. Wire value: `2015-10-12`.
   */
  public data object _20151012 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-10-12"
  }

  /**
   * Documented value. Wire value: `2015-10-16`.
   */
  public data object _20151016 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2015-10-16"
  }

  /**
   * Documented value. Wire value: `2016-02-03`.
   */
  public data object _20160203 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-02-03"
  }

  /**
   * Documented value. Wire value: `2016-02-19`.
   */
  public data object _20160219 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-02-19"
  }

  /**
   * Documented value. Wire value: `2016-02-22`.
   */
  public data object _20160222 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-02-22"
  }

  /**
   * Documented value. Wire value: `2016-02-23`.
   */
  public data object _20160223 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-02-23"
  }

  /**
   * Documented value. Wire value: `2016-02-29`.
   */
  public data object _20160229 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-02-29"
  }

  /**
   * Documented value. Wire value: `2016-03-07`.
   */
  public data object _20160307 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-03-07"
  }

  /**
   * Documented value. Wire value: `2016-06-15`.
   */
  public data object _20160615 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-06-15"
  }

  /**
   * Documented value. Wire value: `2016-07-06`.
   */
  public data object _20160706 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-07-06"
  }

  /**
   * Documented value. Wire value: `2016-10-19`.
   */
  public data object _20161019 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2016-10-19"
  }

  /**
   * Documented value. Wire value: `2017-01-27`.
   */
  public data object _20170127 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-01-27"
  }

  /**
   * Documented value. Wire value: `2017-02-14`.
   */
  public data object _20170214 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-02-14"
  }

  /**
   * Documented value. Wire value: `2017-04-06`.
   */
  public data object _20170406 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-04-06"
  }

  /**
   * Documented value. Wire value: `2017-05-25`.
   */
  public data object _20170525 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-05-25"
  }

  /**
   * Documented value. Wire value: `2017-06-05`.
   */
  public data object _20170605 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-06-05"
  }

  /**
   * Documented value. Wire value: `2017-08-15`.
   */
  public data object _20170815 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-08-15"
  }

  /**
   * Documented value. Wire value: `2017-12-14`.
   */
  public data object _20171214 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2017-12-14"
  }

  /**
   * Documented value. Wire value: `2018-01-23`.
   */
  public data object _20180123 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-01-23"
  }

  /**
   * Documented value. Wire value: `2018-02-05`.
   */
  public data object _20180205 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-02-05"
  }

  /**
   * Documented value. Wire value: `2018-02-06`.
   */
  public data object _20180206 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-02-06"
  }

  /**
   * Documented value. Wire value: `2018-02-28`.
   */
  public data object _20180228 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-02-28"
  }

  /**
   * Documented value. Wire value: `2018-05-21`.
   */
  public data object _20180521 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-05-21"
  }

  /**
   * Documented value. Wire value: `2018-07-27`.
   */
  public data object _20180727 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-07-27"
  }

  /**
   * Documented value. Wire value: `2018-08-23`.
   */
  public data object _20180823 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-08-23"
  }

  /**
   * Documented value. Wire value: `2018-09-06`.
   */
  public data object _20180906 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-09-06"
  }

  /**
   * Documented value. Wire value: `2018-09-24`.
   */
  public data object _20180924 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-09-24"
  }

  /**
   * Documented value. Wire value: `2018-10-31`.
   */
  public data object _20181031 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-10-31"
  }

  /**
   * Documented value. Wire value: `2018-11-08`.
   */
  public data object _20181108 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2018-11-08"
  }

  /**
   * Documented value. Wire value: `2019-02-11`.
   */
  public data object _20190211 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-02-11"
  }

  /**
   * Documented value. Wire value: `2019-02-19`.
   */
  public data object _20190219 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-02-19"
  }

  /**
   * Documented value. Wire value: `2019-03-14`.
   */
  public data object _20190314 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-03-14"
  }

  /**
   * Documented value. Wire value: `2019-05-16`.
   */
  public data object _20190516 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-05-16"
  }

  /**
   * Documented value. Wire value: `2019-08-14`.
   */
  public data object _20190814 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-08-14"
  }

  /**
   * Documented value. Wire value: `2019-09-09`.
   */
  public data object _20190909 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-09-09"
  }

  /**
   * Documented value. Wire value: `2019-10-08`.
   */
  public data object _20191008 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-10-08"
  }

  /**
   * Documented value. Wire value: `2019-10-17`.
   */
  public data object _20191017 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-10-17"
  }

  /**
   * Documented value. Wire value: `2019-11-05`.
   */
  public data object _20191105 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-11-05"
  }

  /**
   * Documented value. Wire value: `2019-12-03`.
   */
  public data object _20191203 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2019-12-03"
  }

  /**
   * Documented value. Wire value: `2020-03-02`.
   */
  public data object _20200302 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2020-03-02"
  }

  /**
   * Documented value. Wire value: `2020-08-27`.
   */
  public data object _20200827 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2020-08-27"
  }

  /**
   * Documented value. Wire value: `2022-08-01`.
   */
  public data object _20220801 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2022-08-01"
  }

  /**
   * Documented value. Wire value: `2022-11-15`.
   */
  public data object _20221115 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2022-11-15"
  }

  /**
   * Documented value. Wire value: `2023-08-16`.
   */
  public data object _20230816 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2023-08-16"
  }

  /**
   * Documented value. Wire value: `2023-10-16`.
   */
  public data object _20231016 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2023-10-16"
  }

  /**
   * Documented value. Wire value: `2024-04-10`.
   */
  public data object _20240410 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-04-10"
  }

  /**
   * Documented value. Wire value: `2024-06-20`.
   */
  public data object _20240620 : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-06-20"
  }

  /**
   * Documented value. Wire value: `2024-09-30.acacia`.
   */
  public data object _20240930Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-09-30.acacia"
  }

  /**
   * Documented value. Wire value: `2024-10-28.acacia`.
   */
  public data object _20241028Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-10-28.acacia"
  }

  /**
   * Documented value. Wire value: `2024-11-20.acacia`.
   */
  public data object _20241120Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-11-20.acacia"
  }

  /**
   * Documented value. Wire value: `2024-12-18.acacia`.
   */
  public data object _20241218Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2024-12-18.acacia"
  }

  /**
   * Documented value. Wire value: `2025-01-27.acacia`.
   */
  public data object _20250127Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-01-27.acacia"
  }

  /**
   * Documented value. Wire value: `2025-02-24.acacia`.
   */
  public data object _20250224Acacia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-02-24.acacia"
  }

  /**
   * Documented value. Wire value: `2025-03-01.dashboard`.
   */
  public data object _20250301Dashboard : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-03-01.dashboard"
  }

  /**
   * Documented value. Wire value: `2025-03-31.basil`.
   */
  public data object _20250331Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-03-31.basil"
  }

  /**
   * Documented value. Wire value: `2025-04-30.basil`.
   */
  public data object _20250430Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-04-30.basil"
  }

  /**
   * Documented value. Wire value: `2025-05-28.basil`.
   */
  public data object _20250528Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-05-28.basil"
  }

  /**
   * Documented value. Wire value: `2025-06-30.basil`.
   */
  public data object _20250630Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-06-30.basil"
  }

  /**
   * Documented value. Wire value: `2025-07-30.basil`.
   */
  public data object _20250730Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-07-30.basil"
  }

  /**
   * Documented value. Wire value: `2025-08-27.basil`.
   */
  public data object _20250827Basil : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-08-27.basil"
  }

  /**
   * Documented value. Wire value: `2025-09-30.clover`.
   */
  public data object _20250930Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-09-30.clover"
  }

  /**
   * Documented value. Wire value: `2025-10-29.clover`.
   */
  public data object _20251029Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-10-29.clover"
  }

  /**
   * Documented value. Wire value: `2025-11-17.clover`.
   */
  public data object _20251117Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-11-17.clover"
  }

  /**
   * Documented value. Wire value: `2025-12-15.clover`.
   */
  public data object _20251215Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2025-12-15.clover"
  }

  /**
   * Documented value. Wire value: `2026-01-28.clover`.
   */
  public data object _20260128Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-01-28.clover"
  }

  /**
   * Documented value. Wire value: `2026-02-25.clover`.
   */
  public data object _20260225Clover : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-02-25.clover"
  }

  /**
   * Documented value. Wire value: `2026-03-25.dahlia`.
   */
  public data object _20260325Dahlia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-03-25.dahlia"
  }

  /**
   * Documented value. Wire value: `2026-04-22.dahlia`.
   */
  public data object _20260422Dahlia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-04-22.dahlia"
  }

  /**
   * Documented value. Wire value: `2026-05-27.dahlia`.
   */
  public data object _20260527Dahlia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-05-27.dahlia"
  }

  /**
   * Documented value. Wire value: `2026-06-24.dahlia`.
   */
  public data object _20260624Dahlia : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3() {
    public override val `value`: String = "2026-06-24.dahlia"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3()

  public companion object {
    public fun fromValue(`value`: String): InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3 = when (value) {
      _20110101.value -> _20110101
      _20110621.value -> _20110621
      _20110628.value -> _20110628
      _20110801.value -> _20110801
      _20110915.value -> _20110915
      _20111117.value -> _20111117
      _20120223.value -> _20120223
      _20120325.value -> _20120325
      _20120618.value -> _20120618
      _20120628.value -> _20120628
      _20120709.value -> _20120709
      _20120924.value -> _20120924
      _20121026.value -> _20121026
      _20121107.value -> _20121107
      _20130211.value -> _20130211
      _20130213.value -> _20130213
      _20130705.value -> _20130705
      _20130812.value -> _20130812
      _20130813.value -> _20130813
      _20131029.value -> _20131029
      _20131203.value -> _20131203
      _20140131.value -> _20140131
      _20140313.value -> _20140313
      _20140328.value -> _20140328
      _20140519.value -> _20140519
      _20140613.value -> _20140613
      _20140617.value -> _20140617
      _20140722.value -> _20140722
      _20140726.value -> _20140726
      _20140804.value -> _20140804
      _20140820.value -> _20140820
      _20140908.value -> _20140908
      _20141007.value -> _20141007
      _20141105.value -> _20141105
      _20141120.value -> _20141120
      _20141208.value -> _20141208
      _20141217.value -> _20141217
      _20141222.value -> _20141222
      _20150111.value -> _20150111
      _20150126.value -> _20150126
      _20150210.value -> _20150210
      _20150216.value -> _20150216
      _20150218.value -> _20150218
      _20150324.value -> _20150324
      _20150407.value -> _20150407
      _20150615.value -> _20150615
      _20150707.value -> _20150707
      _20150713.value -> _20150713
      _20150728.value -> _20150728
      _20150807.value -> _20150807
      _20150819.value -> _20150819
      _20150903.value -> _20150903
      _20150908.value -> _20150908
      _20150923.value -> _20150923
      _20151001.value -> _20151001
      _20151012.value -> _20151012
      _20151016.value -> _20151016
      _20160203.value -> _20160203
      _20160219.value -> _20160219
      _20160222.value -> _20160222
      _20160223.value -> _20160223
      _20160229.value -> _20160229
      _20160307.value -> _20160307
      _20160615.value -> _20160615
      _20160706.value -> _20160706
      _20161019.value -> _20161019
      _20170127.value -> _20170127
      _20170214.value -> _20170214
      _20170406.value -> _20170406
      _20170525.value -> _20170525
      _20170605.value -> _20170605
      _20170815.value -> _20170815
      _20171214.value -> _20171214
      _20180123.value -> _20180123
      _20180205.value -> _20180205
      _20180206.value -> _20180206
      _20180228.value -> _20180228
      _20180521.value -> _20180521
      _20180727.value -> _20180727
      _20180823.value -> _20180823
      _20180906.value -> _20180906
      _20180924.value -> _20180924
      _20181031.value -> _20181031
      _20181108.value -> _20181108
      _20190211.value -> _20190211
      _20190219.value -> _20190219
      _20190314.value -> _20190314
      _20190516.value -> _20190516
      _20190814.value -> _20190814
      _20190909.value -> _20190909
      _20191008.value -> _20191008
      _20191017.value -> _20191017
      _20191105.value -> _20191105
      _20191203.value -> _20191203
      _20200302.value -> _20200302
      _20200827.value -> _20200827
      _20220801.value -> _20220801
      _20221115.value -> _20221115
      _20230816.value -> _20230816
      _20231016.value -> _20231016
      _20240410.value -> _20240410
      _20240620.value -> _20240620
      _20240930Acacia.value -> _20240930Acacia
      _20241028Acacia.value -> _20241028Acacia
      _20241120Acacia.value -> _20241120Acacia
      _20241218Acacia.value -> _20241218Acacia
      _20250127Acacia.value -> _20250127Acacia
      _20250224Acacia.value -> _20250224Acacia
      _20250301Dashboard.value -> _20250301Dashboard
      _20250331Basil.value -> _20250331Basil
      _20250430Basil.value -> _20250430Basil
      _20250528Basil.value -> _20250528Basil
      _20250630Basil.value -> _20250630Basil
      _20250730Basil.value -> _20250730Basil
      _20250827Basil.value -> _20250827Basil
      _20250930Clover.value -> _20250930Clover
      _20251029Clover.value -> _20251029Clover
      _20251117Clover.value -> _20251117Clover
      _20251215Clover.value -> _20251215Clover
      _20260128Clover.value -> _20260128Clover
      _20260225Clover.value -> _20260225Clover
      _20260325Dahlia.value -> _20260325Dahlia
      _20260422Dahlia.value -> _20260422Dahlia
      _20260527Dahlia.value -> _20260527Dahlia
      _20260624Dahlia.value -> _20260624Dahlia
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1WebhookEndpointsPostRequestFormApiVersionX55858af3) {
      encoder.encodeString(value.value)
    }
  }
}
