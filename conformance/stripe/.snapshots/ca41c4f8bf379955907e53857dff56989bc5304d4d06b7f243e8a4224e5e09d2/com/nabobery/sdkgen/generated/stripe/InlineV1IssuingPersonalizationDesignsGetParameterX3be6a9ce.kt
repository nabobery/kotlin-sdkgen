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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/get/parameters/6/schema
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce.Serializer::class)
public sealed class InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `review`.
   */
  public data object Review : InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce() {
    public override val `value`: String = "review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Rejected.value -> Rejected
      Review.value -> Review
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce) {
      encoder.encodeString(value.value)
    }
  }
}
