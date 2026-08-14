package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace/properties/location
 */
@Serializable(with = InlineCodespaceLocationXfbc83597.Serializer::class)
public sealed class InlineCodespaceLocationXfbc83597 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `EastUs`.
   */
  public data object EastUs : InlineCodespaceLocationXfbc83597() {
    public override val `value`: String = "EastUs"
  }

  /**
   * Documented value. Wire value: `SouthEastAsia`.
   */
  public data object SouthEastAsia : InlineCodespaceLocationXfbc83597() {
    public override val `value`: String = "SouthEastAsia"
  }

  /**
   * Documented value. Wire value: `WestEurope`.
   */
  public data object WestEurope : InlineCodespaceLocationXfbc83597() {
    public override val `value`: String = "WestEurope"
  }

  /**
   * Documented value. Wire value: `WestUs2`.
   */
  public data object WestUs2 : InlineCodespaceLocationXfbc83597() {
    public override val `value`: String = "WestUs2"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodespaceLocationXfbc83597()

  public companion object {
    public fun fromValue(`value`: String): InlineCodespaceLocationXfbc83597 = when (value) {
      EastUs.value -> EastUs
      SouthEastAsia.value -> SouthEastAsia
      WestEurope.value -> WestEurope
      WestUs2.value -> WestUs2
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodespaceLocationXfbc83597> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodespaceLocationXfbc83597", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodespaceLocationXfbc83597 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodespaceLocationXfbc83597) {
      encoder.encodeString(value.value)
    }
  }
}
