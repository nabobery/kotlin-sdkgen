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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1balance_transactions/post/requestBody/content/applic
 * ation~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e.Serializer::class)
public sealed class InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e) {
      encoder.encodeString(value.value)
    }
  }
}
