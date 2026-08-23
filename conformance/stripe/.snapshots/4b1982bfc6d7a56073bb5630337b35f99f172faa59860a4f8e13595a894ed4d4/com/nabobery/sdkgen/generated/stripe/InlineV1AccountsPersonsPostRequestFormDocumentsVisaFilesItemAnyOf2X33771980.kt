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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/visa/properties/files/items/anyOf/1
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsVisaFilesItemAnyOf2X33771980) {
      encoder.encodeString(value.value)
    }
  }
}
