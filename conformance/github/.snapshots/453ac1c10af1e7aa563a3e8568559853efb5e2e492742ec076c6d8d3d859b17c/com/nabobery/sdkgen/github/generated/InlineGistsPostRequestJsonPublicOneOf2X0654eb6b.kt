package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema/properties/public/oneOf
 * /1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1gists/post/requestBody/content/application~1json/schema/properties/public/oneOf
 * /1
 */
@Serializable(with = InlineGistsPostRequestJsonPublicOneOf2X0654eb6b.Serializer::class)
public sealed class InlineGistsPostRequestJsonPublicOneOf2X0654eb6b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlineGistsPostRequestJsonPublicOneOf2X0654eb6b() {
    public override val `value`: String = "true"
  }

  /**
   * Documented value. Wire value: `false`.
   */
  public data object FalseValue : InlineGistsPostRequestJsonPublicOneOf2X0654eb6b() {
    public override val `value`: String = "false"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGistsPostRequestJsonPublicOneOf2X0654eb6b()

  public companion object {
    public fun fromValue(`value`: String): InlineGistsPostRequestJsonPublicOneOf2X0654eb6b = when (value) {
      TrueValue.value -> TrueValue
      FalseValue.value -> FalseValue
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGistsPostRequestJsonPublicOneOf2X0654eb6b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineGistsPostRequestJsonPublicOneOf2X0654eb6b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGistsPostRequestJsonPublicOneOf2X0654eb6b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGistsPostRequestJsonPublicOneOf2X0654eb6b) {
      encoder.encodeString(value.value)
    }
  }
}
