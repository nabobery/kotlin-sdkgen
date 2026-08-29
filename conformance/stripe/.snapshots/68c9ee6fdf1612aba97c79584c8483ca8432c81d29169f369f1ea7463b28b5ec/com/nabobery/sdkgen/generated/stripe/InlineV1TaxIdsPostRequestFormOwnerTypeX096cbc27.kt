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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax_ids/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/owner/properties/type
 */
@Serializable(with = InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27.Serializer::class)
public sealed class InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27() {
    public override val `value`: String = "account"
  }

  /**
   * Documented value. Wire value: `application`.
   */
  public data object Application : InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27() {
    public override val `value`: String = "application"
  }

  /**
   * Documented value. Wire value: `customer`.
   */
  public data object Customer : InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27() {
    public override val `value`: String = "customer"
  }

  /**
   * Documented value. Wire value: `self`.
   */
  public data object Self : InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27() {
    public override val `value`: String = "self"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27 = when (value) {
      Account.value -> Account
      Application.value -> Application
      Customer.value -> Customer
      Self.value -> Self
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxIdsPostRequestFormOwnerTypeX096cbc27) {
      encoder.encodeString(value.value)
    }
  }
}
