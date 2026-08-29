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
 * m-urlencoded/schema/properties/dob/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/dob/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a) {
      encoder.encodeString(value.value)
    }
  }
}
