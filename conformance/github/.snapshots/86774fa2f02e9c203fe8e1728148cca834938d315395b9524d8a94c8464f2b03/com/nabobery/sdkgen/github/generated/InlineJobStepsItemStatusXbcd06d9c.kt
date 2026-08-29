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
 * The phase of the lifecycle that the job is currently in.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/job/properties/steps/items/properties/status
 */
@Serializable(with = InlineJobStepsItemStatusXbcd06d9c.Serializer::class)
public sealed class InlineJobStepsItemStatusXbcd06d9c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineJobStepsItemStatusXbcd06d9c() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineJobStepsItemStatusXbcd06d9c() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineJobStepsItemStatusXbcd06d9c() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineJobStepsItemStatusXbcd06d9c()

  public companion object {
    public fun fromValue(`value`: String): InlineJobStepsItemStatusXbcd06d9c = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineJobStepsItemStatusXbcd06d9c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineJobStepsItemStatusXbcd06d9c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineJobStepsItemStatusXbcd06d9c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineJobStepsItemStatusXbcd06d9c) {
      encoder.encodeString(value.value)
    }
  }
}
