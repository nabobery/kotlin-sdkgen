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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ParetoRouterPlugin/properties/id
 */
@Serializable(with = InlineParetoRouterPluginIdX5f41930c.Serializer::class)
public sealed class InlineParetoRouterPluginIdX5f41930c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pareto-router`.
   */
  public data object ParetoRouter : InlineParetoRouterPluginIdX5f41930c() {
    public override val `value`: String = "pareto-router"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineParetoRouterPluginIdX5f41930c()

  public companion object {
    public fun fromValue(`value`: String): InlineParetoRouterPluginIdX5f41930c = when (value) {
      ParetoRouter.value -> ParetoRouter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineParetoRouterPluginIdX5f41930c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineParetoRouterPluginIdX5f41930c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineParetoRouterPluginIdX5f41930c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineParetoRouterPluginIdX5f41930c) {
      encoder.encodeString(value.value)
    }
  }
}
