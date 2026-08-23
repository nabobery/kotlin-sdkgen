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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/get/parameters/0/schema
 */
@Serializable(with = InlineV1BillingAlertsGetParameterX18b42878.Serializer::class)
public sealed class InlineV1BillingAlertsGetParameterX18b42878 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `usage_threshold`.
   */
  public data object UsageThreshold : InlineV1BillingAlertsGetParameterX18b42878() {
    public override val `value`: String = "usage_threshold"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingAlertsGetParameterX18b42878()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingAlertsGetParameterX18b42878 = when (value) {
      UsageThreshold.value -> UsageThreshold
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingAlertsGetParameterX18b42878> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsGetParameterX18b42878", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsGetParameterX18b42878 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsGetParameterX18b42878) {
      encoder.encodeString(value.value)
    }
  }
}
