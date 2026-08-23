package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/interval
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateIntervalX63e53acc.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateIntervalX63e53acc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `one_time`.
   */
  public data object OneTime : InlineV1SourcesPostRequestFormMandateIntervalX63e53acc() {
    public override val `value`: String = "one_time"
  }

  /**
   * Documented value. Wire value: `scheduled`.
   */
  public data object Scheduled : InlineV1SourcesPostRequestFormMandateIntervalX63e53acc() {
    public override val `value`: String = "scheduled"
  }

  /**
   * Documented value. Wire value: `variable`.
   */
  public data object Variable : InlineV1SourcesPostRequestFormMandateIntervalX63e53acc() {
    public override val `value`: String = "variable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormMandateIntervalX63e53acc()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateIntervalX63e53acc = when (value) {
      OneTime.value -> OneTime
      Scheduled.value -> Scheduled
      Variable.value -> Variable
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateIntervalX63e53acc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateIntervalX63e53acc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateIntervalX63e53acc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateIntervalX63e53acc) {
      encoder.encodeString(value.value)
    }
  }
}
