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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/job/properties/status
 */
@Serializable(with = InlineJobStatusX8d47bb87.Serializer::class)
public sealed class InlineJobStatusX8d47bb87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineJobStatusX8d47bb87() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineJobStatusX8d47bb87()

  public companion object {
    public fun fromValue(`value`: String): InlineJobStatusX8d47bb87 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Requested.value -> Requested
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineJobStatusX8d47bb87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineJobStatusX8d47bb87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineJobStatusX8d47bb87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineJobStatusX8d47bb87) {
      encoder.encodeString(value.value)
    }
  }
}
