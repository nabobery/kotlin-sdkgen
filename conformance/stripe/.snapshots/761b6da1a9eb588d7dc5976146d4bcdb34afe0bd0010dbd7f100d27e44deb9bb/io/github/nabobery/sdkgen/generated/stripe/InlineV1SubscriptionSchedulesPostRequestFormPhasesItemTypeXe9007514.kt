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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/start/properti
 * es/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/period/properties/start/properti
 * es/type
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max_item_period_start`.
   */
  public data object MaxItemPeriodStart : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514() {
    public override val `value`: String = "max_item_period_start"
  }

  /**
   * Documented value. Wire value: `phase_start`.
   */
  public data object PhaseStart : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514() {
    public override val `value`: String = "phase_start"
  }

  /**
   * Documented value. Wire value: `timestamp`.
   */
  public data object Timestamp : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514() {
    public override val `value`: String = "timestamp"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514 = when (value) {
      MaxItemPeriodStart.value -> MaxItemPeriodStart
      PhaseStart.value -> PhaseStart
      Timestamp.value -> Timestamp
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeXe9007514) {
      encoder.encodeString(value.value)
    }
  }
}
