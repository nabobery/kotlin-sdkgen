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
 * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or
 * `completed`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite/properties/stat
 * us
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384.Serializer::class)
public sealed class InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `requested`.
   */
  public data object Requested : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384() {
    public override val `value`: String = "requested"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384 = when (value) {
      Requested.value -> Requested
      InProgress.value -> InProgress
      Completed.value -> Completed
      Queued.value -> Queued
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384) {
      encoder.encodeString(value.value)
    }
  }
}
