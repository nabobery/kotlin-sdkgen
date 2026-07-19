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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ParetoRouterPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasParetoRouterPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasParetoRouterPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pareto-router`.
   */
  public data object ParetoRouter : InlineComponentsSchemasParetoRouterPluginPropertiesId() {
    public override val `value`: String = "pareto-router"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasParetoRouterPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasParetoRouterPluginPropertiesId = when (value) {
      ParetoRouter.value -> ParetoRouter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasParetoRouterPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasParetoRouterPluginPropertiesId", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasParetoRouterPluginPropertiesId =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasParetoRouterPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
