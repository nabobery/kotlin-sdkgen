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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/amount_includes_iof.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/pix/properties/mandate_options/properties/amount_includes_iof
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormAmountIncludesIofX556c736b) {
      encoder.encodeString(value.value)
    }
  }
}
