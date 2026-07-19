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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PromptCacheOptions/properties/mode.
 */
@Serializable(with = InlineComponentsSchemasPromptCacheOptionsPropertiesMode.Serializer::class)
public sealed class InlineComponentsSchemasPromptCacheOptionsPropertiesMode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `explicit`.
   */
  public data object Explicit : InlineComponentsSchemasPromptCacheOptionsPropertiesMode() {
    public override val `value`: String = "explicit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPromptCacheOptionsPropertiesMode()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPromptCacheOptionsPropertiesMode = when (value) {
      Explicit.value -> Explicit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPromptCacheOptionsPropertiesMode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPromptCacheOptionsPropertiesMode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPromptCacheOptionsPropertiesMode =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPromptCacheOptionsPropertiesMode) {
      encoder.encodeString(value.value)
    }
  }
}
