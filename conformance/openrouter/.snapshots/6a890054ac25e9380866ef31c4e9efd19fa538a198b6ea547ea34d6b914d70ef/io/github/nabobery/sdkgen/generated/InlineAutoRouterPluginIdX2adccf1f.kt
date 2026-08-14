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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AutoRouterPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AutoRouterPlugin/properties/id
 */
@Serializable(with = InlineAutoRouterPluginIdX2adccf1f.Serializer::class)
public sealed class InlineAutoRouterPluginIdX2adccf1f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto-router`.
   */
  public data object AutoRouter : InlineAutoRouterPluginIdX2adccf1f() {
    public override val `value`: String = "auto-router"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAutoRouterPluginIdX2adccf1f()

  public companion object {
    public fun fromValue(`value`: String): InlineAutoRouterPluginIdX2adccf1f = when (value) {
      AutoRouter.value -> AutoRouter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAutoRouterPluginIdX2adccf1f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAutoRouterPluginIdX2adccf1f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAutoRouterPluginIdX2adccf1f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAutoRouterPluginIdX2adccf1f) {
      encoder.encodeString(value.value)
    }
  }
}
