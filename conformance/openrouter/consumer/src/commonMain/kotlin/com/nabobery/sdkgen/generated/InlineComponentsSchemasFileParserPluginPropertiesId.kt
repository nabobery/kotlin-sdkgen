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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileParserPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasFileParserPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasFileParserPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file-parser`.
   */
  public data object FileParser : InlineComponentsSchemasFileParserPluginPropertiesId() {
    public override val `value`: String = "file-parser"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileParserPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileParserPluginPropertiesId = when (value) {
      FileParser.value -> FileParser
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileParserPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileParserPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileParserPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileParserPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
