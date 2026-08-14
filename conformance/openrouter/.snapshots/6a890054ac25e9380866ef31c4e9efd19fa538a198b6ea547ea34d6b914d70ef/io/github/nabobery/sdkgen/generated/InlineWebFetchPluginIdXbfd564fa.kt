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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebFetchPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebFetchPlugin/properties/id
 */
@Serializable(with = InlineWebFetchPluginIdXbfd564fa.Serializer::class)
public sealed class InlineWebFetchPluginIdXbfd564fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web-fetch`.
   */
  public data object WebFetch : InlineWebFetchPluginIdXbfd564fa() {
    public override val `value`: String = "web-fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebFetchPluginIdXbfd564fa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebFetchPluginIdXbfd564fa = when (value) {
      WebFetch.value -> WebFetch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebFetchPluginIdXbfd564fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebFetchPluginIdXbfd564fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebFetchPluginIdXbfd564fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebFetchPluginIdXbfd564fa) {
      encoder.encodeString(value.value)
    }
  }
}
