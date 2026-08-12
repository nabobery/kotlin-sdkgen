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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_payment_methods/properties/allow_redirects.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/automatic_payment_methods/properties/allow_redirects
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9 = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormAllowRedirectsXe4d208f9) {
      encoder.encodeString(value.value)
    }
  }
}
