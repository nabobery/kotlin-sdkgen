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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchUserLocation/properties/type
 */
@Serializable(with = InlineWebSearchUserLocationTypeXaf641920.Serializer::class)
public sealed class InlineWebSearchUserLocationTypeXaf641920 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approximate`.
   */
  public data object Approximate : InlineWebSearchUserLocationTypeXaf641920() {
    public override val `value`: String = "approximate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebSearchUserLocationTypeXaf641920()

  public companion object {
    public fun fromValue(`value`: String): InlineWebSearchUserLocationTypeXaf641920 = when (value) {
      Approximate.value -> Approximate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebSearchUserLocationTypeXaf641920> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineWebSearchUserLocationTypeXaf641920", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebSearchUserLocationTypeXaf641920 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebSearchUserLocationTypeXaf641920) {
      encoder.encodeString(value.value)
    }
  }
}
