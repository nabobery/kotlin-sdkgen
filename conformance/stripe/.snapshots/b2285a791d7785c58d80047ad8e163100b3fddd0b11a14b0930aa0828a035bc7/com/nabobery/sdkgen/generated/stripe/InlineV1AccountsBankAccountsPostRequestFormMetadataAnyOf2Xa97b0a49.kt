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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts~1{id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49.Serializer::class)
public sealed class InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49) {
      encoder.encodeString(value.value)
    }
  }
}
