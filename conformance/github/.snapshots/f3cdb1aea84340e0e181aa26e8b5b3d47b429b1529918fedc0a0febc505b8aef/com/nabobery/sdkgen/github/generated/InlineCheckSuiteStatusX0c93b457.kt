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
 * The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are
 * reserved for GitHub Actions check suites.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-suite/properties/status
 */
@Serializable(with = InlineCheckSuiteStatusX0c93b457.Serializer::class)
public sealed class InlineCheckSuiteStatusX0c93b457 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `waiting`.
   */
  public data object Waiting : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "waiting"
  }

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineCheckSuiteStatusX0c93b457() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckSuiteStatusX0c93b457()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckSuiteStatusX0c93b457 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Waiting.value -> Waiting
      Requested.value -> Requested
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckSuiteStatusX0c93b457> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCheckSuiteStatusX0c93b457", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckSuiteStatusX0c93b457 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckSuiteStatusX0c93b457) {
      encoder.encodeString(value.value)
    }
  }
}
