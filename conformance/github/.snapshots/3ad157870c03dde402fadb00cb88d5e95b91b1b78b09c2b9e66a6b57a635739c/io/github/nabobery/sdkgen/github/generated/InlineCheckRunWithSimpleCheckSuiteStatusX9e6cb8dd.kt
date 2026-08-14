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
 * The phase of the lifecycle that the check is currently in.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite/properties/status
 */
@Serializable(with = InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd.Serializer::class)
public sealed class InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd) {
      encoder.encodeString(value.value)
    }
  }
}
