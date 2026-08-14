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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/amount_include
 * s_iof.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/amount_include
 * s_iof
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountIncludesIofX4fbf6994) {
      encoder.encodeString(value.value)
    }
  }
}
