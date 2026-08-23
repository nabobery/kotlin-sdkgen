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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/business_type
 */
@Serializable(with = InlineV1AccountsPostRequestFormBusinessTypeX9db4a925.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBusinessTypeX9db4a925 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1AccountsPostRequestFormBusinessTypeX9db4a925() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `government_entity`.
   */
  public data object GovernmentEntity : InlineV1AccountsPostRequestFormBusinessTypeX9db4a925() {
    public override val `value`: String = "government_entity"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1AccountsPostRequestFormBusinessTypeX9db4a925() {
    public override val `value`: String = "individual"
  }

  /**
   * Documented value. Wire value: `non_profit`.
   */
  public data object NonProfit : InlineV1AccountsPostRequestFormBusinessTypeX9db4a925() {
    public override val `value`: String = "non_profit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBusinessTypeX9db4a925()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBusinessTypeX9db4a925 = when (value) {
      Company.value -> Company
      GovernmentEntity.value -> GovernmentEntity
      Individual.value -> Individual
      NonProfit.value -> NonProfit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBusinessTypeX9db4a925> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBusinessTypeX9db4a925", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBusinessTypeX9db4a925 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBusinessTypeX9db4a925) {
      encoder.encodeString(value.value)
    }
  }
}
