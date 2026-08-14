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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/status/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/status/schema
 */
@Serializable(with = InlineStatusParameterX8d584d89.Serializer::class)
public sealed class InlineStatusParameterX8d584d89 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `queued`.
   */
  public data object Queued : InlineStatusParameterX8d584d89() {
    public override val `value`: String = "queued"
  }

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineStatusParameterX8d584d89() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineStatusParameterX8d584d89() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineStatusParameterX8d584d89()

  public companion object {
    public fun fromValue(`value`: String): InlineStatusParameterX8d584d89 = when (value) {
      Queued.value -> Queued
      InProgress.value -> InProgress
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineStatusParameterX8d584d89> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineStatusParameterX8d584d89", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineStatusParameterX8d584d89 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineStatusParameterX8d584d89) {
      encoder.encodeString(value.value)
    }
  }
}
