package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/parameters/api-insights-route-stats-sort/schema/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/api-insights-route-stats-sort/schema/items
 */
@Serializable(with = InlineApiInsightsRouteStatsSortParameterItemXd384f1e9.Serializer::class)
public sealed class InlineApiInsightsRouteStatsSortParameterItemXd384f1e9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `last_rate_limited_timestamp`.
   */
  public data object LastRateLimitedTimestamp : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "last_rate_limited_timestamp"
  }

  /**
   * Documented value. Wire value: `last_request_timestamp`.
   */
  public data object LastRequestTimestamp : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "last_request_timestamp"
  }

  /**
   * Documented value. Wire value: `rate_limited_request_count`.
   */
  public data object RateLimitedRequestCount : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "rate_limited_request_count"
  }

  /**
   * Documented value. Wire value: `http_method`.
   */
  public data object HttpMethod : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "http_method"
  }

  /**
   * Documented value. Wire value: `api_route`.
   */
  public data object ApiRoute : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "api_route"
  }

  /**
   * Documented value. Wire value: `total_request_count`.
   */
  public data object TotalRequestCount : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9() {
    public override val `value`: String = "total_request_count"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApiInsightsRouteStatsSortParameterItemXd384f1e9()

  public companion object {
    public fun fromValue(`value`: String): InlineApiInsightsRouteStatsSortParameterItemXd384f1e9 = when (value) {
      LastRateLimitedTimestamp.value -> LastRateLimitedTimestamp
      LastRequestTimestamp.value -> LastRequestTimestamp
      RateLimitedRequestCount.value -> RateLimitedRequestCount
      HttpMethod.value -> HttpMethod
      ApiRoute.value -> ApiRoute
      TotalRequestCount.value -> TotalRequestCount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApiInsightsRouteStatsSortParameterItemXd384f1e9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineApiInsightsRouteStatsSortParameterItemXd384f1e9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApiInsightsRouteStatsSortParameterItemXd384f1e9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApiInsightsRouteStatsSortParameterItemXd384f1e9) {
      encoder.encodeString(value.value)
    }
  }
}
