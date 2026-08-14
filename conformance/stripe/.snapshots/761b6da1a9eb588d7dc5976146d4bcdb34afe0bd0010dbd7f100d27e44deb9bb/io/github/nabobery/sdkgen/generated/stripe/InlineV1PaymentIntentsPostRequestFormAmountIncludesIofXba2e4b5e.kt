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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/amou
 * nt_includes_iof.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/pix/anyOf/0/properties/mandate_options/properties/amou
 * nt_includes_iof
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountIncludesIofXba2e4b5e) {
      encoder.encodeString(value.value)
    }
  }
}
