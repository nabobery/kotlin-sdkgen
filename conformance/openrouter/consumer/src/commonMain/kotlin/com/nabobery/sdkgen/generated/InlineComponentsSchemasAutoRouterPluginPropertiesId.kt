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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AutoRouterPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasAutoRouterPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasAutoRouterPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto-router`.
   */
  public data object AutoRouter : InlineComponentsSchemasAutoRouterPluginPropertiesId() {
    public override val `value`: String = "auto-router"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAutoRouterPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAutoRouterPluginPropertiesId = when (value) {
      AutoRouter.value -> AutoRouter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAutoRouterPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAutoRouterPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAutoRouterPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAutoRouterPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
