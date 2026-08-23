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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X479c8e9b) {
      encoder.encodeString(value.value)
    }
  }
}
