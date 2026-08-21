package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Truncation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Truncation
 */
@Serializable(with = Truncation.Serializer::class)
public sealed class Truncation {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : Truncation() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : Truncation() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : Truncation()

  public companion object {
    public fun fromValue(`value`: String): Truncation = when (value) {
      Auto.value -> Auto
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<Truncation> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.Truncation", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): Truncation = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: Truncation) {
      encoder.encodeString(value.value)
    }
  }
}
