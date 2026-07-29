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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/minority_owned_business_designation/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_profile/properties/minority_owned_business_designation/items
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lgbtqi_owned_business`.
   */
  public data object LgbtqiOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd() {
    public override val `value`: String = "lgbtqi_owned_business"
  }

  /**
   * Documented value. Wire value: `minority_owned_business`.
   */
  public data object MinorityOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd() {
    public override val `value`: String = "minority_owned_business"
  }

  /**
   * Documented value. Wire value: `none_of_these_apply`.
   */
  public data object NoneOfTheseApply : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd() {
    public override val `value`: String = "none_of_these_apply"
  }

  /**
   * Documented value. Wire value: `prefer_not_to_answer`.
   */
  public data object PreferNotToAnswer : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd() {
    public override val `value`: String = "prefer_not_to_answer"
  }

  /**
   * Documented value. Wire value: `women_owned_business`.
   */
  public data object WomenOwnedBusiness : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd() {
    public override val `value`: String = "women_owned_business"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd = when (value) {
      LgbtqiOwnedBusiness.value -> LgbtqiOwnedBusiness
      MinorityOwnedBusiness.value -> MinorityOwnedBusiness
      NoneOfTheseApply.value -> NoneOfTheseApply
      PreferNotToAnswer.value -> PreferNotToAnswer
      WomenOwnedBusiness.value -> WomenOwnedBusiness
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessProfileItemX58ddeefd) {
      encoder.encodeString(value.value)
    }
  }
}
