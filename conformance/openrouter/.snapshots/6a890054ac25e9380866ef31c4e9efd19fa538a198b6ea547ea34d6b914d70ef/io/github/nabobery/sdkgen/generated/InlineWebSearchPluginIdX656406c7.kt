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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin/properties/id
 */
@Serializable(with = InlineWebSearchPluginIdX656406c7.Serializer::class)
public sealed class InlineWebSearchPluginIdX656406c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineWebSearchPluginIdX656406c7() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchPluginIdX656406c7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchPluginIdX656406c7 = when (value) {
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchPluginIdX656406c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchPluginIdX656406c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchPluginIdX656406c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchPluginIdX656406c7) {
      encoder.encodeString(value.value)
    }
  }
}
