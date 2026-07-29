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
 * Whether this personalization design can be used to create cards.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design/properties/status
 */
@Serializable(with = InlineIssuingPersonalizationDesignStatusX112137d7.Serializer::class)
public sealed class InlineIssuingPersonalizationDesignStatusX112137d7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineIssuingPersonalizationDesignStatusX112137d7() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineIssuingPersonalizationDesignStatusX112137d7() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineIssuingPersonalizationDesignStatusX112137d7() {
    public override val `value`: String = "rejected"
  }

  /**
   * Documented value. Wire value: `review`.
   */
  public data object Review : InlineIssuingPersonalizationDesignStatusX112137d7() {
    public override val `value`: String = "review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingPersonalizationDesignStatusX112137d7()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingPersonalizationDesignStatusX112137d7 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Rejected.value -> Rejected
      Review.value -> Review
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingPersonalizationDesignStatusX112137d7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingPersonalizationDesignStatusX112137d7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignStatusX112137d7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignStatusX112137d7) {
      encoder.encodeString(value.value)
    }
  }
}
