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
 * oded/schema/properties/business_profile/properties/minority_owned_business_designation/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_profile/properties/minority_owned_business_designation/items
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lgbtqi_owned_business`.
   */
  public data object LgbtqiOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613() {
    public override val `value`: String = "lgbtqi_owned_business"
  }

  /**
   * Documented value. Wire value: `minority_owned_business`.
   */
  public data object MinorityOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613() {
    public override val `value`: String = "minority_owned_business"
  }

  /**
   * Documented value. Wire value: `none_of_these_apply`.
   */
  public data object NoneOfTheseApply : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613() {
    public override val `value`: String = "none_of_these_apply"
  }

  /**
   * Documented value. Wire value: `prefer_not_to_answer`.
   */
  public data object PreferNotToAnswer : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613() {
    public override val `value`: String = "prefer_not_to_answer"
  }

  /**
   * Documented value. Wire value: `women_owned_business`.
   */
  public data object WomenOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613() {
    public override val `value`: String = "women_owned_business"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613 = when (value) {
      LgbtqiOwnedBusiness.value -> LgbtqiOwnedBusiness
      MinorityOwnedBusiness.value -> MinorityOwnedBusiness
      NoneOfTheseApply.value -> NoneOfTheseApply
      PreferNotToAnswer.value -> PreferNotToAnswer
      WomenOwnedBusiness.value -> WomenOwnedBusiness
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileItemX9abae613) {
      encoder.encodeString(value.value)
    }
  }
}
