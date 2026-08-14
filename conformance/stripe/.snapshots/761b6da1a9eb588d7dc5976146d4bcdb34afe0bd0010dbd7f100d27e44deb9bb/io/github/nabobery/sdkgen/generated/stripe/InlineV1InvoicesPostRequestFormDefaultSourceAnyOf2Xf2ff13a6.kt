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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_source/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/default_source/anyOf/1
 */
@Serializable(with = InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormDefaultSourceAnyOf2Xf2ff13a6) {
      encoder.encodeString(value.value)
    }
  }
}
