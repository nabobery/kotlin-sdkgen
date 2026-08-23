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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping/properties/service.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/shipping/properties/service
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b.Serializer::class)
public sealed class InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `express`.
   */
  public data object Express : InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b() {
    public override val `value`: String = "express"
  }

  /**
   * Documented value. Wire value: `priority`.
   */
  public data object Priority : InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b() {
    public override val `value`: String = "priority"
  }

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b() {
    public override val `value`: String = "standard"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b = when (value) {
      Express.value -> Express
      Priority.value -> Priority
      Standard.value -> Standard
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormShippingServiceX4b8d197b) {
      encoder.encodeString(value.value)
    }
  }
}
