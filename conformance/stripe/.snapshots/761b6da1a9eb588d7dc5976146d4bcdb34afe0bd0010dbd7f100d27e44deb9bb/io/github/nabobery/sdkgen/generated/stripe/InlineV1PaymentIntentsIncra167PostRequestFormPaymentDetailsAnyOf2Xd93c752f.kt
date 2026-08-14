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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/order_reference/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/order_reference/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f) {
      encoder.encodeString(value.value)
    }
  }
}
