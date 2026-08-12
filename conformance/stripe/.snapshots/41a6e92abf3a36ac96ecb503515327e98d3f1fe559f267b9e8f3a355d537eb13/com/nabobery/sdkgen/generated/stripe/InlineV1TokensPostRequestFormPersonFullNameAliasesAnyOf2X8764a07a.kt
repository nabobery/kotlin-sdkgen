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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/full_name_aliases/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/full_name_aliases/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonFullNameAliasesAnyOf2X8764a07a) {
      encoder.encodeString(value.value)
    }
  }
}
