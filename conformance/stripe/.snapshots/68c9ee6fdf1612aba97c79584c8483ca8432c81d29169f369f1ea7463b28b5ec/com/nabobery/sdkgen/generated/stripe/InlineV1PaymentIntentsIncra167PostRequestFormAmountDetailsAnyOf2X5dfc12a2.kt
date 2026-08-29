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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2) {
      encoder.encodeString(value.value)
    }
  }
}
