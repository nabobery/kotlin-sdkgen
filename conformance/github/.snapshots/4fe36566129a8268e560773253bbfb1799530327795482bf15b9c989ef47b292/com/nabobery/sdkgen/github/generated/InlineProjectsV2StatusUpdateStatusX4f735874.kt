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
 * The current status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/projects-v2-status-update/properties/status
 */
@Serializable(with = InlineProjectsV2StatusUpdateStatusX4f735874.Serializer::class)
public sealed class InlineProjectsV2StatusUpdateStatusX4f735874 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `INACTIVE`.
   */
  public data object Inactive : InlineProjectsV2StatusUpdateStatusX4f735874() {
    public override val `value`: String = "INACTIVE"
  }

  /**
   * Documented value. Wire value: `ON_TRACK`.
   */
  public data object OnTrack : InlineProjectsV2StatusUpdateStatusX4f735874() {
    public override val `value`: String = "ON_TRACK"
  }

  /**
   * Documented value. Wire value: `AT_RISK`.
   */
  public data object AtRisk : InlineProjectsV2StatusUpdateStatusX4f735874() {
    public override val `value`: String = "AT_RISK"
  }

  /**
   * Documented value. Wire value: `OFF_TRACK`.
   */
  public data object OffTrack : InlineProjectsV2StatusUpdateStatusX4f735874() {
    public override val `value`: String = "OFF_TRACK"
  }

  /**
   * Documented value. Wire value: `COMPLETE`.
   */
  public data object Complete : InlineProjectsV2StatusUpdateStatusX4f735874() {
    public override val `value`: String = "COMPLETE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineProjectsV2StatusUpdateStatusX4f735874()

  public companion object {
    public fun fromValue(`value`: String): InlineProjectsV2StatusUpdateStatusX4f735874 = when (value) {
      Inactive.value -> Inactive
      OnTrack.value -> OnTrack
      AtRisk.value -> AtRisk
      OffTrack.value -> OffTrack
      Complete.value -> Complete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineProjectsV2StatusUpdateStatusX4f735874> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineProjectsV2StatusUpdateStatusX4f735874", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineProjectsV2StatusUpdateStatusX4f735874 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineProjectsV2StatusUpdateStatusX4f735874) {
      encoder.encodeString(value.value)
    }
  }
}
