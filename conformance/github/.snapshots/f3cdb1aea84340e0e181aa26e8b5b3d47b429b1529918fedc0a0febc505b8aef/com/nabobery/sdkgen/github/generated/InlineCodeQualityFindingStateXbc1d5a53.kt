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
 * State of the code quality finding.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding/properties/state
 */
@Serializable(with = InlineCodeQualityFindingStateXbc1d5a53.Serializer::class)
public sealed class InlineCodeQualityFindingStateXbc1d5a53 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineCodeQualityFindingStateXbc1d5a53() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineCodeQualityFindingStateXbc1d5a53() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualityFindingStateXbc1d5a53()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualityFindingStateXbc1d5a53 = when (value) {
      Open.value -> Open
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualityFindingStateXbc1d5a53> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualityFindingStateXbc1d5a53", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualityFindingStateXbc1d5a53 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualityFindingStateXbc1d5a53) {
      encoder.encodeString(value.value)
    }
  }
}
