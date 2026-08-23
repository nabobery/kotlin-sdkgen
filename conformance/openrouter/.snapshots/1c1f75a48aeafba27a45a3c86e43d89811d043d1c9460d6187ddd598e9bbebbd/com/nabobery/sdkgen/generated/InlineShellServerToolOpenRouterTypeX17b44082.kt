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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ShellServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ShellServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineShellServerToolOpenRouterTypeX17b44082.Serializer::class)
public sealed class InlineShellServerToolOpenRouterTypeX17b44082 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:shell`.
   */
  public data object OpenrouterShell : InlineShellServerToolOpenRouterTypeX17b44082() {
    public override val `value`: String = "openrouter:shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineShellServerToolOpenRouterTypeX17b44082()

  public companion object {
    public fun fromValue(`value`: String): InlineShellServerToolOpenRouterTypeX17b44082 = when (value) {
      OpenrouterShell.value -> OpenrouterShell
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineShellServerToolOpenRouterTypeX17b44082> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineShellServerToolOpenRouterTypeX17b44082", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineShellServerToolOpenRouterTypeX17b44082 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineShellServerToolOpenRouterTypeX17b44082) {
      encoder.encodeString(value.value)
    }
  }
}
