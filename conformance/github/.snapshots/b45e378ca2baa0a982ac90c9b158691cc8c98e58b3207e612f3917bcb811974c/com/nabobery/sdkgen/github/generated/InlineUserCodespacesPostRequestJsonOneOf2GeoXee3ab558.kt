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
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces/post/requestBody/content/application~1json/schema/oneOf/1/prop
 * erties/geo
 */
@Serializable(with = InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558.Serializer::class)
public sealed class InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EuropeWest`.
   */
  public data object EuropeWest : InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558() {
    public override val `value`: String = "EuropeWest"
  }

  /**
   * Documented value. Wire value: `SoutheastAsia`.
   */
  public data object SoutheastAsia : InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558() {
    public override val `value`: String = "SoutheastAsia"
  }

  /**
   * Documented value. Wire value: `UsEast`.
   */
  public data object UsEast : InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558() {
    public override val `value`: String = "UsEast"
  }

  /**
   * Documented value. Wire value: `UsWest`.
   */
  public data object UsWest : InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558() {
    public override val `value`: String = "UsWest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558()

  public companion object {
    public fun fromValue(`value`: String): InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558 = when (value) {
      EuropeWest.value -> EuropeWest
      SoutheastAsia.value -> SoutheastAsia
      UsEast.value -> UsEast
      UsWest.value -> UsWest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesPostRequestJsonOneOf2GeoXee3ab558) {
      encoder.encodeString(value.value)
    }
  }
}
