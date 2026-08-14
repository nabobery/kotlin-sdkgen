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
 * The current status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-projects-v2-status-update/properties/status
 */
@Serializable(with = InlineNullableProjectsV2StatusUpdateStatusX315eeecf.Serializer::class)
public sealed class InlineNullableProjectsV2StatusUpdateStatusX315eeecf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `INACTIVE`.
   */
  public data object Inactive : InlineNullableProjectsV2StatusUpdateStatusX315eeecf() {
    public override val `value`: String = "INACTIVE"
  }

  /**
   * Documented value. Wire value: `ON_TRACK`.
   */
  public data object OnTrack : InlineNullableProjectsV2StatusUpdateStatusX315eeecf() {
    public override val `value`: String = "ON_TRACK"
  }

  /**
   * Documented value. Wire value: `AT_RISK`.
   */
  public data object AtRisk : InlineNullableProjectsV2StatusUpdateStatusX315eeecf() {
    public override val `value`: String = "AT_RISK"
  }

  /**
   * Documented value. Wire value: `OFF_TRACK`.
   */
  public data object OffTrack : InlineNullableProjectsV2StatusUpdateStatusX315eeecf() {
    public override val `value`: String = "OFF_TRACK"
  }

  /**
   * Documented value. Wire value: `COMPLETE`.
   */
  public data object Complete : InlineNullableProjectsV2StatusUpdateStatusX315eeecf() {
    public override val `value`: String = "COMPLETE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineNullableProjectsV2StatusUpdateStatusX315eeecf()

  public companion object {
    public fun fromValue(`value`: String): InlineNullableProjectsV2StatusUpdateStatusX315eeecf = when (value) {
      Inactive.value -> Inactive
      OnTrack.value -> OnTrack
      AtRisk.value -> AtRisk
      OffTrack.value -> OffTrack
      Complete.value -> Complete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineNullableProjectsV2StatusUpdateStatusX315eeecf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineNullableProjectsV2StatusUpdateStatusX315eeecf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineNullableProjectsV2StatusUpdateStatusX315eeecf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineNullableProjectsV2StatusUpdateStatusX315eeecf) {
      encoder.encodeString(value.value)
    }
  }
}
