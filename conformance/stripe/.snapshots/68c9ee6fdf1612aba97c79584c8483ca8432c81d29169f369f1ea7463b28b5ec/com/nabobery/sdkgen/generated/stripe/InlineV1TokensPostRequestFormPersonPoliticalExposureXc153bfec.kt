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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/political_exposure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/political_exposure
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `existing`.
   */
  public data object Existing : InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec() {
    public override val `value`: String = "existing"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec = when (value) {
      Existing.value -> Existing
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec) {
      encoder.encodeString(value.value)
    }
  }
}
