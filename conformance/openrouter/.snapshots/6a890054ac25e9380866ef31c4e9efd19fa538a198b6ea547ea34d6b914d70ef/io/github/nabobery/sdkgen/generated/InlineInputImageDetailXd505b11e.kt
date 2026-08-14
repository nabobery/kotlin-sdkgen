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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/detail.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputImage/properties/detail
 */
@Serializable(with = InlineInputImageDetailXd505b11e.Serializer::class)
public sealed class InlineInputImageDetailXd505b11e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineInputImageDetailXd505b11e() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineInputImageDetailXd505b11e() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineInputImageDetailXd505b11e() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `original`.
   */
  public data object Original : InlineInputImageDetailXd505b11e() {
    public override val `value`: String = "original"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputImageDetailXd505b11e()

  public companion object {
    public fun fromValue(`value`: String): InlineInputImageDetailXd505b11e = when (value) {
      Auto.value -> Auto
      High.value -> High
      Low.value -> Low
      Original.value -> Original
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputImageDetailXd505b11e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputImageDetailXd505b11e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputImageDetailXd505b11e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputImageDetailXd505b11e) {
      encoder.encodeString(value.value)
    }
  }
}
