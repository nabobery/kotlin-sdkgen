package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileParserPlugin/properties/id
 */
@Serializable(with = InlineFileParserPluginIdX43ae2ffb.Serializer::class)
public sealed class InlineFileParserPluginIdX43ae2ffb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file-parser`.
   */
  public data object FileParser : InlineFileParserPluginIdX43ae2ffb() {
    public override val `value`: String = "file-parser"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileParserPluginIdX43ae2ffb()

  public companion object {
    public fun fromValue(`value`: String): InlineFileParserPluginIdX43ae2ffb = when (value) {
      FileParser.value -> FileParser
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileParserPluginIdX43ae2ffb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFileParserPluginIdX43ae2ffb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileParserPluginIdX43ae2ffb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileParserPluginIdX43ae2ffb) {
      encoder.encodeString(value.value)
    }
  }
}
