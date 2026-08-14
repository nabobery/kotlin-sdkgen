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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/en
 * d/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/en
 * d/properties/type
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `min_item_period_end`.
   */
  public data object MinItemPeriodEnd : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467() {
    public override val `value`: String = "min_item_period_end"
  }

  /**
   * Documented value. Wire value: `phase_end`.
   */
  public data object PhaseEnd : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467() {
    public override val `value`: String = "phase_end"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467 = when (value) {
      MinItemPeriodEnd.value -> MinItemPeriodEnd
      PhaseEnd.value -> PhaseEnd
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX5c521467) {
      encoder.encodeString(value.value)
    }
  }
}
