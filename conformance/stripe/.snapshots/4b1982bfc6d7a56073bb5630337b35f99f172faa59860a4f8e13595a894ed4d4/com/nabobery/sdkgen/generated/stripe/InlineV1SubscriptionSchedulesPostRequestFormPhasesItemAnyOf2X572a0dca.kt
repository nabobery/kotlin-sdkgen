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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/add_invoice_items/items/properties/tax_rates/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X572a0dca) {
      encoder.encodeString(value.value)
    }
  }
}
