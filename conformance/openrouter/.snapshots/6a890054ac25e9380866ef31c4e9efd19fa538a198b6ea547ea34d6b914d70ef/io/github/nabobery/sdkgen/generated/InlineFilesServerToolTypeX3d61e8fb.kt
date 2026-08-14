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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FilesServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FilesServerTool/properties/type
 */
@Serializable(with = InlineFilesServerToolTypeX3d61e8fb.Serializer::class)
public sealed class InlineFilesServerToolTypeX3d61e8fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:files`.
   */
  public data object OpenrouterFiles : InlineFilesServerToolTypeX3d61e8fb() {
    public override val `value`: String = "openrouter:files"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFilesServerToolTypeX3d61e8fb()

  public companion object {
    public fun fromValue(`value`: String): InlineFilesServerToolTypeX3d61e8fb = when (value) {
      OpenrouterFiles.value -> OpenrouterFiles
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFilesServerToolTypeX3d61e8fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFilesServerToolTypeX3d61e8fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFilesServerToolTypeX3d61e8fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFilesServerToolTypeX3d61e8fb) {
      encoder.encodeString(value.value)
    }
  }
}
