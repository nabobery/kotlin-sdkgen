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
 * encoded/schema/properties/default_settings/properties/collection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/collection_method
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555.Serializer::class)
public sealed class InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `charge_automatically`.
   */
  public data object ChargeAutomatically : InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555() {
    public override val `value`: String = "charge_automatically"
  }

  /**
   * Documented value. Wire value: `send_invoice`.
   */
  public data object SendInvoice : InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555() {
    public override val `value`: String = "send_invoice"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555 = when (value) {
      ChargeAutomatically.value -> ChargeAutomatically
      SendInvoice.value -> SendInvoice
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormCollectionMethodX28d2c555) {
      encoder.encodeString(value.value)
    }
  }
}
