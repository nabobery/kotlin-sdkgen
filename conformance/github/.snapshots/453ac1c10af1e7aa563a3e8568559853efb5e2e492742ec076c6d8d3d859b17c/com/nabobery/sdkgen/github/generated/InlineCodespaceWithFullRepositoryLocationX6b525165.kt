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
 * The initally assigned location of a new codespace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace-with-full-repository/properties/location
 */
@Serializable(with = InlineCodespaceWithFullRepositoryLocationX6b525165.Serializer::class)
public sealed class InlineCodespaceWithFullRepositoryLocationX6b525165 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EastUs`.
   */
  public data object EastUs : InlineCodespaceWithFullRepositoryLocationX6b525165() {
    public override val `value`: String = "EastUs"
  }

  /**
   * Documented value. Wire value: `SouthEastAsia`.
   */
  public data object SouthEastAsia : InlineCodespaceWithFullRepositoryLocationX6b525165() {
    public override val `value`: String = "SouthEastAsia"
  }

  /**
   * Documented value. Wire value: `WestEurope`.
   */
  public data object WestEurope : InlineCodespaceWithFullRepositoryLocationX6b525165() {
    public override val `value`: String = "WestEurope"
  }

  /**
   * Documented value. Wire value: `WestUs2`.
   */
  public data object WestUs2 : InlineCodespaceWithFullRepositoryLocationX6b525165() {
    public override val `value`: String = "WestUs2"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespaceWithFullRepositoryLocationX6b525165()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespaceWithFullRepositoryLocationX6b525165 = when (value) {
      EastUs.value -> EastUs
      SouthEastAsia.value -> SouthEastAsia
      WestEurope.value -> WestEurope
      WestUs2.value -> WestUs2
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodespaceWithFullRepositoryLocationX6b525165> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodespaceWithFullRepositoryLocationX6b525165", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespaceWithFullRepositoryLocationX6b525165 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceWithFullRepositoryLocationX6b525165) {
      encoder.encodeString(value.value)
    }
  }
}
