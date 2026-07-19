package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileCitation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFileCitationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFileCitationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_citation`.
   */
  public data object FileCitation : InlineComponentsSchemasFileCitationPropertiesType() {
    public override val `value`: String = "file_citation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileCitationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileCitationPropertiesType = when (value) {
      FileCitation.value -> FileCitation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileCitationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileCitationPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileCitationPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileCitationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
