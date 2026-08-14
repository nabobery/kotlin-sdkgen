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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchSource/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchSource/properties/type
 */
@Serializable(with = InlineWebSearchSourceTypeX50e6d83b.Serializer::class)
public sealed class InlineWebSearchSourceTypeX50e6d83b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineWebSearchSourceTypeX50e6d83b() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchSourceTypeX50e6d83b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchSourceTypeX50e6d83b = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchSourceTypeX50e6d83b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchSourceTypeX50e6d83b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchSourceTypeX50e6d83b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchSourceTypeX50e6d83b) {
      encoder.encodeString(value.value)
    }
  }
}
