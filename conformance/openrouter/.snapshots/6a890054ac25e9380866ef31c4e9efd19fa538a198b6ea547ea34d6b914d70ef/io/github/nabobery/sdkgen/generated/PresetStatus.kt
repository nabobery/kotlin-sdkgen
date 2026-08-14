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
 * The status of a preset.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PresetStatus
 */
@Serializable(with = PresetStatus.Serializer::class)
public sealed class PresetStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : PresetStatus() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : PresetStatus() {
    public override val `value`: String = "disabled"
  }

  /**
   * Documented value. Wire value: `archived`.
   */
  public data object Archived : PresetStatus() {
    public override val `value`: String = "archived"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : PresetStatus()

  public companion object {
    public fun fromValue(`value`: String): PresetStatus = when (value) {
      Active.value -> Active
      Disabled.value -> Disabled
      Archived.value -> Archived
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<PresetStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.PresetStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): PresetStatus = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: PresetStatus) {
      encoder.encodeString(value.value)
    }
  }
}
