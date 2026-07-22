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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1{pull_number}~1codespaces/post/requestBody/conte
 * nt/application~1json/schema/properties/geo
 */
@Serializable(with = InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1.Serializer::class)
public sealed class InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EuropeWest`.
   */
  public data object EuropeWest : InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1() {
    public override val `value`: String = "EuropeWest"
  }

  /**
   * Documented value. Wire value: `SoutheastAsia`.
   */
  public data object SoutheastAsia : InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1() {
    public override val `value`: String = "SoutheastAsia"
  }

  /**
   * Documented value. Wire value: `UsEast`.
   */
  public data object UsEast : InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1() {
    public override val `value`: String = "UsEast"
  }

  /**
   * Documented value. Wire value: `UsWest`.
   */
  public data object UsWest : InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1() {
    public override val `value`: String = "UsWest"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1 = when (value) {
      EuropeWest.value -> EuropeWest
      SoutheastAsia.value -> SoutheastAsia
      UsEast.value -> UsEast
      UsWest.value -> UsWest
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCodespacesPostRequestJsonGeoXd7756eb1) {
      encoder.encodeString(value.value)
    }
  }
}
