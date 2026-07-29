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
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount/an
 * yOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount/an
 * yOf/1
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d) {
      encoder.encodeString(value.value)
    }
  }
}
