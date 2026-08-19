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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InProgressEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InProgressEvent/properties/type
 */
@Serializable(with = InlineInProgressEventTypeX9cb33eb5.Serializer::class)
public sealed class InlineInProgressEventTypeX9cb33eb5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.in_progress`.
   */
  public data object ResponseInProgress : InlineInProgressEventTypeX9cb33eb5() {
    public override val `value`: String = "response.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInProgressEventTypeX9cb33eb5()

  public companion object {
    public fun fromValue(`value`: String): InlineInProgressEventTypeX9cb33eb5 = when (value) {
      ResponseInProgress.value -> ResponseInProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInProgressEventTypeX9cb33eb5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineInProgressEventTypeX9cb33eb5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInProgressEventTypeX9cb33eb5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInProgressEventTypeX9cb33eb5) {
      encoder.encodeString(value.value)
    }
  }
}
