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
 * The reason for the current state
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue/properties/state_reason
 */
@Serializable(with = InlineIssueStateReasonXe3fcb695.Serializer::class)
public sealed class InlineIssueStateReasonXe3fcb695 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineIssueStateReasonXe3fcb695() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `reopened`.
   */
  public data object Reopened : InlineIssueStateReasonXe3fcb695() {
    public override val `value`: String = "reopened"
  }

  /**
   * Documented value. Wire value: `not_planned`.
   */
  public data object NotPlanned : InlineIssueStateReasonXe3fcb695() {
    public override val `value`: String = "not_planned"
  }

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineIssueStateReasonXe3fcb695() {
    public override val `value`: String = "duplicate"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssueStateReasonXe3fcb695()

  public companion object {
    public fun fromValue(`value`: String): InlineIssueStateReasonXe3fcb695 = when (value) {
      Completed.value -> Completed
      Reopened.value -> Reopened
      NotPlanned.value -> NotPlanned
      Duplicate.value -> Duplicate
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssueStateReasonXe3fcb695> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineIssueStateReasonXe3fcb695", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssueStateReasonXe3fcb695 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssueStateReasonXe3fcb695) {
      encoder.encodeString(value.value)
    }
  }
}
