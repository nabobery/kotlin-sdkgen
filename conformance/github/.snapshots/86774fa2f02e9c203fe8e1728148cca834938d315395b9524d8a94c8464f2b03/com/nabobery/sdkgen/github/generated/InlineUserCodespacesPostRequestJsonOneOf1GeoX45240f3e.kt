package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces
 * `location`, which is closing down.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/0/prop
 * erties/geo
 */
@Serializable(with = InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e.Serializer::class)
public sealed class InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EuropeWest`.
   */
  public data object EuropeWest : InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e() {
    public override val `value`: String = "EuropeWest"
  }

  /**
   * Documented value. Wire value: `SoutheastAsia`.
   */
  public data object SoutheastAsia : InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e() {
    public override val `value`: String = "SoutheastAsia"
  }

  /**
   * Documented value. Wire value: `UsEast`.
   */
  public data object UsEast : InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e() {
    public override val `value`: String = "UsEast"
  }

  /**
   * Documented value. Wire value: `UsWest`.
   */
  public data object UsWest : InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e() {
    public override val `value`: String = "UsWest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e()

  public companion object {
    public fun fromValue(`value`: String): InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e = when (value) {
      EuropeWest.value -> EuropeWest
      SoutheastAsia.value -> SoutheastAsia
      UsEast.value -> UsEast
      UsWest.value -> UsWest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPostRequestJsonOneOf1GeoX45240f3e) {
      encoder.encodeString(value.value)
    }
  }
}
