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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces/post/requestBody/content/application~1json/s
 * chema/properties/geo
 */
@Serializable(with = InlineReposCodespacesPostRequestJsonGeoX54c944c3.Serializer::class)
public sealed class InlineReposCodespacesPostRequestJsonGeoX54c944c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EuropeWest`.
   */
  public data object EuropeWest : InlineReposCodespacesPostRequestJsonGeoX54c944c3() {
    public override val `value`: String = "EuropeWest"
  }

  /**
   * Documented value. Wire value: `SoutheastAsia`.
   */
  public data object SoutheastAsia : InlineReposCodespacesPostRequestJsonGeoX54c944c3() {
    public override val `value`: String = "SoutheastAsia"
  }

  /**
   * Documented value. Wire value: `UsEast`.
   */
  public data object UsEast : InlineReposCodespacesPostRequestJsonGeoX54c944c3() {
    public override val `value`: String = "UsEast"
  }

  /**
   * Documented value. Wire value: `UsWest`.
   */
  public data object UsWest : InlineReposCodespacesPostRequestJsonGeoX54c944c3() {
    public override val `value`: String = "UsWest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCodespacesPostRequestJsonGeoX54c944c3()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCodespacesPostRequestJsonGeoX54c944c3 = when (value) {
      EuropeWest.value -> EuropeWest
      SoutheastAsia.value -> SoutheastAsia
      UsEast.value -> UsEast
      UsWest.value -> UsWest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCodespacesPostRequestJsonGeoX54c944c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposCodespacesPostRequestJsonGeoX54c944c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCodespacesPostRequestJsonGeoX54c944c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesPostRequestJsonGeoX54c944c3) {
      encoder.encodeString(value.value)
    }
  }
}
