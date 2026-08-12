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
 * The business type. Once you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions),
 * this property can only be updated for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/business_type
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessTypeX724dec40.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBusinessTypeX724dec40 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1AccountsPostRequestFormBusinessTypeX724dec40() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `government_entity`.
   */
  public data object GovernmentEntity : InlineV1AccountsPostRequestFormBusinessTypeX724dec40() {
    public override val `value`: String = "government_entity"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1AccountsPostRequestFormBusinessTypeX724dec40() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `non_profit`.
   */
  public data object NonProfit : InlineV1AccountsPostRequestFormBusinessTypeX724dec40() {
    public override val `value`: String = "non_profit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBusinessTypeX724dec40()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBusinessTypeX724dec40 = when (value) {
      Company.value -> Company
      GovernmentEntity.value -> GovernmentEntity
      Individual.value -> Individual
      NonProfit.value -> NonProfit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessTypeX724dec40> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBusinessTypeX724dec40", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessTypeX724dec40 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessTypeX724dec40) {
      encoder.encodeString(value.value)
    }
  }
}
