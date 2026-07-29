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
 * The frequency of the periodic analysis.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup/properties/schedule
 */
@Serializable(with = InlineCodeQualitySetupScheduleX559f612d.Serializer::class)
public sealed class InlineCodeQualitySetupScheduleX559f612d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineCodeQualitySetupScheduleX559f612d() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualitySetupScheduleX559f612d()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualitySetupScheduleX559f612d = when (value) {
      Weekly.value -> Weekly
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeQualitySetupScheduleX559f612d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeQualitySetupScheduleX559f612d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualitySetupScheduleX559f612d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualitySetupScheduleX559f612d) {
      encoder.encodeString(value.value)
    }
  }
}
