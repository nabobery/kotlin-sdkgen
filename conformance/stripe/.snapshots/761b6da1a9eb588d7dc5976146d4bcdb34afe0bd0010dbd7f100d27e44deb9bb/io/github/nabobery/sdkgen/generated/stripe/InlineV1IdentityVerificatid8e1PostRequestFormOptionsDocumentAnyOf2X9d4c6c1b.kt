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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/1
 */
@Serializable(with = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b.Serializer::class)
public sealed class InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b) {
      encoder.encodeString(value.value)
    }
  }
}
