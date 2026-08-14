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
 * The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved
 * for GitHub Actions check runs.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run/properties/status
 */
@Serializable(with = InlineCheckRunStatusX21c79aef.Serializer::class)
public sealed class InlineCheckRunStatusX21c79aef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineCheckRunStatusX21c79aef() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckRunStatusX21c79aef()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckRunStatusX21c79aef = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Requested.value -> Requested
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckRunStatusX21c79aef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCheckRunStatusX21c79aef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckRunStatusX21c79aef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunStatusX21c79aef) {
      encoder.encodeString(value.value)
    }
  }
}
