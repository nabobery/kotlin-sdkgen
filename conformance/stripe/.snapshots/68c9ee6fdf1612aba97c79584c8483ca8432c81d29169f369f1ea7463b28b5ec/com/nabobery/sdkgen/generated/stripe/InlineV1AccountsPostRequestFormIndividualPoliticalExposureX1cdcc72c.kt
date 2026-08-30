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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/political_exposure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/political_exposure
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing`.
   */
  public data object Existing : InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c() {
    public override val `value`: String = "existing"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c = when (value) {
      Existing.value -> Existing
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c) {
      encoder.encodeString(value.value)
    }
  }
}
