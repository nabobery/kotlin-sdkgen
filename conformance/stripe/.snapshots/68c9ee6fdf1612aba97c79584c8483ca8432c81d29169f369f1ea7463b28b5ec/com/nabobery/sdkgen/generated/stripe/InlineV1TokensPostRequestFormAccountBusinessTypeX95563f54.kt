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
 * roperties/account/properties/business_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/business_type
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54.Serializer::class)
public sealed class InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `government_entity`.
   */
  public data object GovernmentEntity : InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54() {
    public override val `value`: String = "government_entity"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `non_profit`.
   */
  public data object NonProfit : InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54() {
    public override val `value`: String = "non_profit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54 = when (value) {
      Company.value -> Company
      GovernmentEntity.value -> GovernmentEntity
      Individual.value -> Individual
      NonProfit.value -> NonProfit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54) {
      encoder.encodeString(value.value)
    }
  }
}
