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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/full_name_aliases/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/full_name_aliases/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d) {
      encoder.encodeString(value.value)
    }
  }
}
