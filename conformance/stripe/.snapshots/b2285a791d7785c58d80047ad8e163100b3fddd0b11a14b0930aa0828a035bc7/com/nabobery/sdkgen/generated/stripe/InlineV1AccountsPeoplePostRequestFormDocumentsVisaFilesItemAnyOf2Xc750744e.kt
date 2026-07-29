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
 * m-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsVisaFilesItemAnyOf2Xc750744e) {
      encoder.encodeString(value.value)
    }
  }
}
