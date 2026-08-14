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
 * Specifies whether to cancel a single event or a range of events for a time period. Time period cancellation is not
 * supported yet.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meter_event_adjustments/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/type
 */
@Serializable(with = InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1.Serializer::class)
public sealed class InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1() {
    public override val `value`: String = "cancel"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1 = when (value) {
      Cancel.value -> Cancel
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMeterEventAdjustmentsPostRequestFormTypeXf6f087e1) {
      encoder.encodeString(value.value)
    }
  }
}
