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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationResponse/properties/status.
 */
@Serializable(with = InlineComponentsSchemasVideoGenerationResponsePropertiesStatus.Serializer::class)
public sealed class InlineComponentsSchemasVideoGenerationResponsePropertiesStatus {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `cancelled`.
   */
  public data object Cancelled : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "cancelled"
  }

  /**
   * Documented value. Wire value: `expired`.
   */
  public data object Expired : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus() {
    public override val `value`: String = "expired"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasVideoGenerationResponsePropertiesStatus()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasVideoGenerationResponsePropertiesStatus =
      when (value) {
      Pending.value -> Pending
      InProgress.value -> InProgress
      Completed.value -> Completed
      Failed.value -> Failed
      Cancelled.value -> Cancelled
      Expired.value -> Expired
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasVideoGenerationResponsePropertiesStatus> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasVideoGenerationResponsePropertiesStatus", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasVideoGenerationResponsePropertiesStatus =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasVideoGenerationResponsePropertiesStatus) {
      encoder.encodeString(value.value)
    }
  }
}
