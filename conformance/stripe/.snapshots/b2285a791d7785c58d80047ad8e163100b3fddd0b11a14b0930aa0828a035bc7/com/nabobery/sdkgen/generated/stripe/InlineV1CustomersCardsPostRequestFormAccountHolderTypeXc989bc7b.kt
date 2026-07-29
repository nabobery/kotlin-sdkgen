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
 * The type of entity that holds the account. This can be either `individual` or `company`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/account_holder_type
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b.Serializer::class)
public sealed class InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormAccountHolderTypeXc989bc7b) {
      encoder.encodeString(value.value)
    }
  }
}
