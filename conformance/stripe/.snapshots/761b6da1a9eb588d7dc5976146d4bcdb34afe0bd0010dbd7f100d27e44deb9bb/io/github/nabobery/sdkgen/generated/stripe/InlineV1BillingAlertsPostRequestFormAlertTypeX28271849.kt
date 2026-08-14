package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The type of alert to create.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1alerts/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/alert_type
 */
@Serializable(with = InlineV1BillingAlertsPostRequestFormAlertTypeX28271849.Serializer::class)
public sealed class InlineV1BillingAlertsPostRequestFormAlertTypeX28271849 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `usage_threshold`.
   */
  public data object UsageThreshold : InlineV1BillingAlertsPostRequestFormAlertTypeX28271849() {
    public override val `value`: String = "usage_threshold"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingAlertsPostRequestFormAlertTypeX28271849()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingAlertsPostRequestFormAlertTypeX28271849 = when (value) {
      UsageThreshold.value -> UsageThreshold
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingAlertsPostRequestFormAlertTypeX28271849> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingAlertsPostRequestFormAlertTypeX28271849", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingAlertsPostRequestFormAlertTypeX28271849 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingAlertsPostRequestFormAlertTypeX28271849) {
      encoder.encodeString(value.value)
    }
  }
}
