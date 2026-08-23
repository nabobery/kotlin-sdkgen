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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/documents/properties/passport/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDocumentsPassportFilesItemAnyOf2X7e67feb8) {
      encoder.encodeString(value.value)
    }
  }
}
