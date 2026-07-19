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
 */
@Serializable(with = InlineComponentsSchemasShellServerToolOpenRouterPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasShellServerToolOpenRouterPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:shell`.
   */
  public data object OpenrouterShell : InlineComponentsSchemasShellServerToolOpenRouterPropertiesType() {
    public override val `value`: String = "openrouter:shell"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasShellServerToolOpenRouterPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasShellServerToolOpenRouterPropertiesType =
      when (value) {
      OpenrouterShell.value -> OpenrouterShell
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasShellServerToolOpenRouterPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasShellServerToolOpenRouterPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasShellServerToolOpenRouterPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasShellServerToolOpenRouterPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
