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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/schedule
 */
@Serializable(with = InlineCodeScanningDefaultSetupScheduleXbe54427e.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupScheduleXbe54427e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `weekly`.
   */
  public data object Weekly : InlineCodeScanningDefaultSetupScheduleXbe54427e() {
    public override val `value`: String = "weekly"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupScheduleXbe54427e()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupScheduleXbe54427e = when (value) {
      Weekly.value -> Weekly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupScheduleXbe54427e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupScheduleXbe54427e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupScheduleXbe54427e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupScheduleXbe54427e) {
      encoder.encodeString(value.value)
    }
  }
}
