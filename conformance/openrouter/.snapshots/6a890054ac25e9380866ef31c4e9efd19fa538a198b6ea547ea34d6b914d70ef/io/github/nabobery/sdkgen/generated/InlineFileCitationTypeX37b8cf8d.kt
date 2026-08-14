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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileCitation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileCitation/properties/type
 */
@Serializable(with = InlineFileCitationTypeX37b8cf8d.Serializer::class)
public sealed class InlineFileCitationTypeX37b8cf8d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_citation`.
   */
  public data object FileCitation : InlineFileCitationTypeX37b8cf8d() {
    public override val `value`: String = "file_citation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileCitationTypeX37b8cf8d()

  public companion object {
    public fun fromValue(`value`: String): InlineFileCitationTypeX37b8cf8d = when (value) {
      FileCitation.value -> FileCitation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileCitationTypeX37b8cf8d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFileCitationTypeX37b8cf8d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileCitationTypeX37b8cf8d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileCitationTypeX37b8cf8d) {
      encoder.encodeString(value.value)
    }
  }
}
